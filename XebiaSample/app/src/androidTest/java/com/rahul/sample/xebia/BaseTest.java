/*
 * Copyright (C) 2015 Brian Lee (@hiBrianLee)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rahul.sample.xebia;

import android.app.Instrumentation;
import android.view.View;


import com.rahul.sample.xebia.adapter.NyNewsAdapter;
import com.rahul.sample.xebia.di.component.AppComponent;
import com.rahul.sample.xebia.di.component.DaggerAppComponent;
import com.rahul.sample.xebia.di.module.AppModule;
import com.rahul.sample.xebia.di.module.NetworkModule;
import com.rahul.sample.xebia.utils.Constants;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;

import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.test.platform.app.InstrumentationRegistry;

public class BaseTest {

AppComponent mAppComponent;

    @CallSuper
    @Before
    public void setUp() throws Exception {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        NyNewsApp application = (NyNewsApp) instrumentation
                .getTargetContext().getApplicationContext();
        mAppComponent= DaggerAppComponent.builder()
                .appModule(new AppModule(NyNewsApp.getInstance()))
                .networkModule(new NetworkModule(Constants.BASE_URL_SERVER))
                .build();


    }

    public static Matcher<View> withRecyclerViewPosition(final int position) {
        return new TypeSafeMatcher<View>() {

            @Override
            public void describeTo(Description description) {
                description.appendText("with RecyclerView position: " + position);
            }

            @Override
            protected boolean matchesSafely(View view) {
                if (!(view.getParent() instanceof RecyclerView)) {
                    return false;
                }

                RecyclerView recyclerView = (RecyclerView) view.getParent();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (!(adapter instanceof NyNewsAdapter)) {
                    return false;
                }
                return position == recyclerView.getChildAdapterPosition(view);
            }
        };
    }
}

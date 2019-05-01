package com.rahul.sample.xebia.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * This class provide activity to attache Fragment in to activity
 * @author Rahul Mishra
 * Date-01-05-2018
 */
@Module
public class FragmentContextModule {
    Activity activity;

    public FragmentContextModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Activity activity() {
        return activity;
    }
}

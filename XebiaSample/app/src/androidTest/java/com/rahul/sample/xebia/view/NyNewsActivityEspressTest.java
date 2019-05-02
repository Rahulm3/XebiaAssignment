package com.rahul.sample.xebia.view;



import com.rahul.sample.xebia.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class NyNewsActivityEspressTest {

    @Rule
    public ActivityTestRule<NyNewsActivity> activityRule
            = new ActivityTestRule<>(NyNewsActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {

        Espresso.onView(ViewMatchers.withId(R.id.recyclerView)).perform(RecyclerViewActions.scrollToPosition(3));
    }

    @Test
    public void onResume() {
    }

    @Test
    public void onRefresh() {
    }

    @Test
    public void onItemClick() {
    }

    @Test
    public void getSize() {
    }
}
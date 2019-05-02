package com.rahul.sample.xebia.viewmodel;



import com.rahul.sample.xebia.BaseTest;
import com.rahul.sample.xebia.NyNewsApp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NYNewsViewModelTest extends BaseTest {
    NYNewsViewModel vm;


    @Before
    public void setUp() throws Exception {
        vm=new NYNewsViewModel(NyNewsApp.getInstance());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNewsFromServer() {

    }

    @Test
    public void getApplication() {
    }

    @Test
    public void onCleared() {
    }

}
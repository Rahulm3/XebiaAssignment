package com.rahul.sample.xebia.view;

import com.google.gson.Gson;
import com.rahul.sample.xebia.models.NyResponse;
import com.rahul.sample.xebia.utils.TestUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.inject.Inject;

import static org.junit.Assert.assertTrue;

public class NyNewsActivityTest {
    private NyResponse newsResponse;


    @Inject
    Gson mGson;

    NyNewsActivity activity;

    @Before
    public void setUp() throws Exception {
        newsResponse= new NyResponse();
        activity = Mockito.spy(new NyNewsActivity());
        newsResponse= TestUtils.loadJson("mock/nyMockListGgn.json",mGson);
        activity.mDataItems=newsResponse.getResults();



    }

    @After
    public void tearDown() throws Exception {


    }
//@Test
//public void onCreate(){
////    activity.onCreate(Mockito.mock(Bundle.class));
//
//    Mockito.verify(activity).onCreate(Mockito.mock(Bundle.class));
//}
    @Test
    public void onRefresh() {
//        assertTrue(mDataItems.contains(""));
    }
    @Test
    public void onItemCount() {
        assertTrue(newsResponse.getResults().size()>0);
    }

    @Test
    public void onItemClick() {

    }
    @Test
    public void getSize(){

        assertTrue(activity.mDataItems.size()>0);
    }
}
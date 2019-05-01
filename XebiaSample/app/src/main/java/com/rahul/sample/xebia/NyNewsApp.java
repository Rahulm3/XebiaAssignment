package com.rahul.sample.xebia;

import android.app.Application;

import com.rahul.sample.xebia.di.component.AppComponent;
import com.rahul.sample.xebia.di.component.DaggerAppComponent;
import com.rahul.sample.xebia.di.module.AppModule;
import com.rahul.sample.xebia.di.module.NetworkModule;
import com.rahul.sample.xebia.utils.Constants;

public class NyNewsApp extends Application {
    private static NyNewsApp mAppInstance;
    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppInstance = this;
        initializeInjector();
    }
    private void initializeInjector(){
        mAppComponent= DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule(Constants.BASE_URL_SERVER))
                .build();
    }
    /**
     * Method to return the instance of this application.
     * @return Instance of this class;
     */
    public static NyNewsApp getInstance() {
        return mAppInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }


}

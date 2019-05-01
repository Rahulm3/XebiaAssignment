package com.rahul.sample.xebia.di.module;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.rahul.sample.xebia.NyNewsApp;
import com.rahul.sample.xebia.di.annotation.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
*APP BASE MODULE WITH MAPPING OF respective modules.
 * @author Rahul Mishra
 * Date-01-05-2018
*/


@Module
public class AppModule {
    NyNewsApp app;
    public AppModule(NyNewsApp app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return app.getApplicationContext();
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }




}

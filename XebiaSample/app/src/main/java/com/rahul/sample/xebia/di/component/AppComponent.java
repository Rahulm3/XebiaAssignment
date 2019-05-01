package com.rahul.sample.xebia.di.component;

import android.content.Context;

import com.google.gson.Gson;
import com.rahul.sample.xebia.di.annotation.ApplicationContext;
import com.rahul.sample.xebia.di.module.AppModule;
import com.rahul.sample.xebia.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 *AppComponent class contains the dependency of App module and n/w module.
 *  Class for Dagger injection. Methods with in the
 * interface is Globally access.
 * @author Rahul Mishra
 * Date-01-05-2018
 */


@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    @ApplicationContext
    Context getContext();
    Gson gson();
    Retrofit getRetrofitClient();
}

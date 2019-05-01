package com.rahul.sample.xebia.di.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * TO get the Application context at runtime.
 * @author Rahul Mishra
 * Date-01-05-2018
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {

}

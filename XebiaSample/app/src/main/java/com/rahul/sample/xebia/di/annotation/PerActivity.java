package com.rahul.sample.xebia.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * TO bind the activity at runtime in module.
 * @author Rahul Mishra
 * Date-01-05-2018
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
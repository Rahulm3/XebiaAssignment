package com.rahul.sample.xebia.di.component;


import com.rahul.sample.xebia.di.annotation.PerActivity;
import com.rahul.sample.xebia.view.NyNewsActivity;
import com.rahul.sample.xebia.viewmodel.NYNewsViewModel;

import dagger.Component;

/**
 * Interface for dependency injection in NYNewsActivity, NYNewsViewModel
 * @author Rahul Mishra
 * Date-01-05-2018
 */
@PerActivity
@Component(dependencies = AppComponent.class)
public interface NYNewsComponent {

    /**
     * Method to provide dependency injection for NYNewsActivity.
     * @param activity Dependent instance to which dagger will provide dependency.
     */
    void inject(NyNewsActivity activity);

    /**
     * Method to provide dependency injection for nyNewsViewModel.
     * @param nyNewsViewModel Dependent instance to which dagger will provide dependency.
     */
    void inject(NYNewsViewModel nyNewsViewModel);
}

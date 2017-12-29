package com.stan.dagger_android.news;

import com.stan.dagger_android.di.ActivityScoped;

import dagger.Binds;
import dagger.Module;

/**
 * Created by uu on 2017/12/29.
 */

@Module
public abstract class NewsModule {

    @ActivityScoped
    @Binds
    abstract ActivityNewsContract.Presenter newsPresenter(NewsPresenter activityNews);

}

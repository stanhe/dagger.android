package com.stan.dagger_android.news

import com.stan.dagger_android.di.ActivityScoped

import dagger.Binds
import dagger.Module

/**
 * Created by uu on 2017/12/29.
 */

@Module
abstract class NewsModule {

    @ActivityScoped
    @Binds
    internal abstract fun newsPresenter(newsPresenter: NewsPresenter): ActivityNewsContract.Presenter

}

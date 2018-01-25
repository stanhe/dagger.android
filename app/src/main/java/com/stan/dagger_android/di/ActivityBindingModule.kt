package com.stan.dagger_android.di

import com.stan.dagger_android.home.ActivityModule
import com.stan.dagger_android.home.MainActivity
import com.stan.dagger_android.news.ActivityNews
import com.stan.dagger_android.news.NewsModule

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by uu on 2017/12/28.
 */
@Module
abstract class ActivityBindingModule {

    // MainActivitySubComponent可使用下面方式创建,前提是 MainActivitySubComponent中不能有其他方法和超类
    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(ActivityModule::class))
    internal abstract fun mainActivity(): MainActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(NewsModule::class))
    internal abstract fun activityNews(): ActivityNews
}

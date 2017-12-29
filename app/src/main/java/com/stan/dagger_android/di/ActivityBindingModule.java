package com.stan.dagger_android.di;

import com.stan.dagger_android.home.ActivityModule;
import com.stan.dagger_android.home.MainActivity;
import com.stan.dagger_android.news.ActivityNews;
import com.stan.dagger_android.news.NewsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by uu on 2017/12/28.
 */
@Module
public abstract class ActivityBindingModule {

    // MainActivitySubComponent可使用下面方式创建,前提是 MainActivitySubComponent中不能有其他方法和超类
    @ActivityScoped
    @ContributesAndroidInjector(modules = ActivityModule.class)
    abstract MainActivity mainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = NewsModule.class)
    abstract ActivityNews activityNews();
}

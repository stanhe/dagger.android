package com.stan.dagger_android.home;


import com.stan.dagger_android.data.Student;
import com.stan.dagger_android.di.ActivityScoped;
import com.stan.dagger_android.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by uu on 2017/12/28.
 */
@Module
public abstract class ActivityModule {

    @Provides
    @ActivityScoped
    static Student getStudent() {
        return new Student("XiaoHong");
    }

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainFragment addMainFragment();

    @ActivityScoped
    @Binds
    abstract MainActivityContract.Presenter mainPresenter(MainActivityPresenter presenter);
}

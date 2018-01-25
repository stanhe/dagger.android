package com.stan.dagger_android.home


import com.stan.dagger_android.data.Student
import com.stan.dagger_android.di.ActivityScoped
import com.stan.dagger_android.di.FragmentScoped

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by uu on 2017/12/28.
 */
@Module
abstract class ActivityModule {

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun addMainFragment(): MainFragment

    @ActivityScoped
    @Binds
    internal abstract fun mainPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

    @Module
    companion object {
        @Provides
        @JvmStatic
        @ActivityScoped
        internal fun student(): Student{
            return  Student("XiaoHong")
        }
    }
}

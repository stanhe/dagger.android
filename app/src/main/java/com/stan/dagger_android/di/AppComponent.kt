package com.stan.dagger_android.di

import android.app.Application
import android.content.Context
import com.stan.dagger_android.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by uu on 2017/12/28.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, //MainActivityModule.class,
        ActivityBindingModule::class, AndroidSupportInjectionModule::class))
interface AppComponent : AndroidInjector<App> {

    val context: Context

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun crete(): AppComponent
    }
}

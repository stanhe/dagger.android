package com.stan.dagger_android.di;

import android.app.Application;
import android.content.Context;

import com.stan.dagger_android.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by uu on 2017/12/28.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        //MainActivityModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<App> {

    Context getContext();

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent crete();
    }
}

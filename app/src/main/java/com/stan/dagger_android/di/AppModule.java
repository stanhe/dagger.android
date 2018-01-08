package com.stan.dagger_android.di;

import android.app.Application;
import android.content.Context;

import com.stan.dagger_android.net.MyRetrofit;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by uu on 2017/12/28.
 */
@Module
public abstract class AppModule {

    @Binds //不需要方法实现，dagger根据返回值和传入的参数推断
    abstract Context bindContext(Application  application);

    @Provides
    static MyRetrofit getMyRetrofit(){
        return MyRetrofit.instance;
    }
}

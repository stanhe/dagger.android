package com.stan.dagger_android.di

import android.app.Application
import android.content.Context
import com.stan.dagger_android.net.Api
import com.stan.dagger_android.net.RetroApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by uu on 2017/12/28.
 */
@Module
abstract class AppModule {

    @Binds //不需要方法实现，dagger根据返回值和传入的参数推断
    internal abstract fun bindContext(application: Application): Context

    @Module
    companion object {
        @Singleton
        @Provides
        @JvmStatic
        internal fun myRetrofit(): Api{
            return RetroApi.getApi()
        }
    }
}

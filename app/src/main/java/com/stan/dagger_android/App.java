package com.stan.dagger_android;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.stan.dagger_android.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;


/**
 * Created by uu on 2017/12/28.
 */

public class App extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
    }

    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter(
                PrettyFormatStrategy.newBuilder()
                        .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                        .methodCount(5)         // (Optional) How many method line to show. Default 2
                        .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                        .tag("Stan")            // (Optional) Global tag for every log. Default PRETTY_LOGGER
                        .build()
        ));
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).crete();
    }

}

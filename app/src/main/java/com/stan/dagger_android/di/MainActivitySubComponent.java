package com.stan.dagger_android.di;
import com.stan.dagger_android.home.ActivityModule;
import com.stan.dagger_android.home.MainActivity;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by uu on 2017/12/28.
 * 非 dagger.android 写法 使用 Subcomponent
 * 2.定义 subcomponent
 */
/*
@Subcomponent(modules = {ActivityModule.class})
//@Subcomponent()
public interface MainActivitySubComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{
        abstract Builder setName(ActivityModule module);
    }
}
*/

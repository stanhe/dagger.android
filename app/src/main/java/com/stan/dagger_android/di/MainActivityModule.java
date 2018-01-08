package com.stan.dagger_android.di;

/**
 * Created by uu on 2017/12/28.
 * 非 dagger.android 写法
 * 1.定义 module
 */
/*
@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<?extends Activity> bind(MainActivitySubComponent.Builder builder);

    // 当前类 含有其他方法 所以不能使用ActivityBindingModule来创建
  */
/*  @Provides
    static Student getNews() {
        return new Student("XiaoHong");
    }*//*



    @Binds
    abstract Context getContext(Application application);
}
*/

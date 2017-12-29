package com.stan.dagger_android.base;

/**
 * Created by uu on 2017/12/29.
 */

public interface BasePresenter<T> {
    void takeView(T view);

    void dropView();
}

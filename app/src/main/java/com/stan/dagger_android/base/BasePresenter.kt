package com.stan.dagger_android.base

/**
 * Created by uu on 2017/12/29.
 */

interface BasePresenter<in T> {
    fun takeView(view: T)

    fun dropView()
}

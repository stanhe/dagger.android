package com.stan.dagger_android.home

import javax.inject.Inject

/**
 * Created by uu on 2017/12/29.
 */

class MainActivityPresenter @Inject constructor() : MainActivityContract.Presenter {

    internal var view: MainActivityContract.View? = null

    override val isDataMissing: Boolean
        get() = true

    override fun takeView(view: MainActivityContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}

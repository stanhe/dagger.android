package com.stan.dagger_android.home

import com.stan.dagger_android.base.DisposablePresenter
import javax.inject.Inject

/**
 * Created by uu on 2017/12/29.
 */

class MainActivityPresenter @Inject constructor() :DisposablePresenter(), MainActivityContract.Presenter {

    internal var view: MainActivityContract.View? = null

    override fun takeView(view: MainActivityContract.View) {
        this.view = view
    }

    override fun dropView() {
        clearDisposable()
        view = null
    }
}

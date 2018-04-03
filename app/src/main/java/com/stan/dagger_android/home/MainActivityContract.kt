package com.stan.dagger_android.home

import com.stan.dagger_android.base.BasePresenter
import com.stan.dagger_android.base.BaseView

/**
 * Created by uu on 2017/12/29.
 */

interface MainActivityContract {
    interface View : BaseView<Presenter> {
        //val isActive: Boolean
    }

    interface Presenter : BasePresenter<View> {
        //val isDataMissing: Boolean
    }
}

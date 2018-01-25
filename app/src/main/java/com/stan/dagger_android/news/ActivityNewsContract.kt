package com.stan.dagger_android.news

import com.stan.dagger_android.base.BasePresenter
import com.stan.dagger_android.base.BaseView

/**
 * Created by uu on 2017/12/29.
 */

interface ActivityNewsContract {
    interface View : BaseView<Presenter> {
        fun showMessage(message: String)
    }

    interface Presenter : BasePresenter<View> {
        fun getMessage(message: String)
    }
}

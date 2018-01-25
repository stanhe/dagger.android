package com.stan.dagger_android.base

import android.view.View

import butterknife.ButterKnife
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by uu on 2017/12/28.
 */

open class BaseActivity : DaggerAppCompatActivity() {
    override fun setContentView(view: View) {
        super.setContentView(view)
        ButterKnife.bind(this)
    }


    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        ButterKnife.bind(this)
    }
}

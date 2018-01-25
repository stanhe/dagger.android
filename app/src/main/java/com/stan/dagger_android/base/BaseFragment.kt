package com.stan.dagger_android.base

import android.os.Bundle
import android.view.View

import butterknife.ButterKnife
import butterknife.Unbinder
import dagger.android.support.DaggerFragment

/**
 * Created by uu on 2017/12/29.
 */

abstract class BaseFragment : DaggerFragment() {
    private var unBinder: Unbinder? = null
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        unBinder = ButterKnife.bind(this, view!!)
        initView()
    }

    abstract fun initView()

    override fun onDestroy() {
        super.onDestroy()
        unBinder?.unbind()
    }
}

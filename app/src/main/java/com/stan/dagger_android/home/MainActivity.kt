package com.stan.dagger_android.home

import android.os.Bundle

import com.stan.dagger_android.R
import com.stan.dagger_android.base.BaseActivity
import com.stan.dagger_android.util.ActivityUtils

import javax.inject.Inject

class MainActivity : BaseActivity(),MainActivityContract.View {

    @Inject
    lateinit var fragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment: MainFragment? = supportFragmentManager.findFragmentById(R.id.contentFrame) as? MainFragment
        if (fragment == null) {
            fragment = this.fragment
            ActivityUtils.addFragmentToActivity(supportFragmentManager, fragment, R.id.contentFrame)
        }

    }

    companion object {
        val TAG = "MainActivity"
    }
}

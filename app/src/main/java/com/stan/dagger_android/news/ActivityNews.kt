package com.stan.dagger_android.news

import android.os.Bundle
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import com.stan.dagger_android.R
import com.stan.dagger_android.base.BaseActivity
import javax.inject.Inject

/**
 * Created by uu on 2017/12/29.
 */

class ActivityNews : BaseActivity(), ActivityNewsContract.View {

    @Inject
    lateinit var presenter: ActivityNewsContract.Presenter

    @BindView(R.id.message)
    lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }

    @OnClick(R.id.message)
    fun clickMessage() {
        presenter.getMessage("getMessage!")
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.dropView()
    }

    override fun showMessage(message: String) {
        this.message.text = message
    }

    companion object {
        val TAG = "ActivityNews"
    }

}

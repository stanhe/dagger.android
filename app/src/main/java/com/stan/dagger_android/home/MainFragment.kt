package com.stan.dagger_android.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import com.stan.dagger_android.R
import com.stan.dagger_android.base.BaseFragment
import com.stan.dagger_android.data.Student
import com.stan.dagger_android.di.ActivityScoped
import com.stan.dagger_android.news.ActivityNews
import javax.inject.Inject


/**
 * Created by uu on 2017/12/29.
 */

@ActivityScoped
class MainFragment @Inject constructor() : BaseFragment(), MainActivityContract.View {

    @Inject
    lateinit var presenter: MainActivityContract.Presenter
    @Inject
    lateinit var student: Student


    @BindView(R.id.text)
    lateinit var textView: TextView

    @OnClick(R.id.text)
    fun clickText() {
        startActivity(Intent(activity, ActivityNews::class.java))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onPause() {
        presenter.dropView()
        super.onPause()
    }


    override fun initView() {
        textView.text = student.name
    }
}

package com.stan.dagger_android.news

import com.orhanobut.logger.Logger
import com.stan.dagger_android.base.DisposablePresenter
import com.stan.dagger_android.data.BaseBackData
import com.stan.dagger_android.net.Api
import com.stan.dagger_android.util.RxUtils
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import javax.inject.Inject

/**
 * Created by uu on 2017/12/29.
 */

class NewsPresenter @Inject
constructor() : DisposablePresenter(), ActivityNewsContract.Presenter {

    internal var view: ActivityNewsContract.View? = null

    @Inject
    lateinit var retroApi: Api


    override fun takeView(view: ActivityNewsContract.View) {
        this.view = view
    }

    override fun dropView() {
        clearDisposable()
        this.view = null
    }

    override fun getMessage(message: String) {
        retroApi.home()
                .compose(RxUtils.applySchedulers())
                .subscribe(object : Observer<BaseBackData> {
                    override fun onSubscribe(d: Disposable) {
                        addDisposable(d)
                    }

                    override fun onNext(baseBackData: BaseBackData) {
                        view?.showMessage(baseBackData.message!!)
                    }

                    override fun onError(e: Throwable) {
                        Logger.e("Error : " + e)
                    }

                    override fun onComplete() {

                    }
                })
    }

    companion object {

        val TAG = "NewsPresenter"
    }
}

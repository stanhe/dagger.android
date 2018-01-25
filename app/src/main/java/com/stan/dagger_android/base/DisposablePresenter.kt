package com.stan.dagger_android.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by uu on 2018/1/11.
 */

open class DisposablePresenter protected constructor() {
    private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    protected fun addDisposable(d: Disposable) {
        compositeDisposable.add(d)
    }

    protected fun clearDisposable() {
        compositeDisposable.clear()
    }
}

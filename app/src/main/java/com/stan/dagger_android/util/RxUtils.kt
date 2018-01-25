package com.stan.dagger_android.util

import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by uu on 2017/12/29.
 */

object RxUtils {

    fun <T> applySchedulers(): ObservableTransformer<T, T> {
        return ObservableTransformer { upstream ->
            upstream
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
        }
    }
}

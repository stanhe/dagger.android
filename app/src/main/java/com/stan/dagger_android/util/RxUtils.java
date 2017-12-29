package com.stan.dagger_android.util;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by uu on 2017/12/29.
 */

public class RxUtils {

    public static  <T> ObservableTransformer<T,T> applySchedulers() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream.observeOn(Schedulers.io()).subscribeOn(AndroidSchedulers.mainThread());
            }
        };
    }
}

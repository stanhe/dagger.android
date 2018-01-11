package com.stan.dagger_android.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by uu on 2018/1/11.
 */

public class DisposablePresenter {
    private CompositeDisposable compositeDisposable;

    protected DisposablePresenter() {
        compositeDisposable = new CompositeDisposable();
    }

    protected void addDisposable(Disposable d){
        compositeDisposable.add(d);
    }

    protected void clearDisposable(){
        compositeDisposable.clear();
    }
}

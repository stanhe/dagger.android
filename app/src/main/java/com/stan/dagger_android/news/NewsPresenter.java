package com.stan.dagger_android.news;

import com.stan.dagger_android.base.DisposablePresenter;
import com.stan.dagger_android.data.BaseBackData;
import com.stan.dagger_android.net.Api;
import com.stan.dagger_android.util.RxUtils;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by uu on 2017/12/29.
 */

public class NewsPresenter extends DisposablePresenter implements ActivityNewsContract.Presenter {

    public static final String TAG = "NewsPresenter";

    //view not inject
    ActivityNewsContract.View view;

    @Inject
    Api retroApi;

    @Inject
    public NewsPresenter() {
    }


    @Override
    public void takeView(ActivityNewsContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        clearDisposable();
        this.view = null;
    }

    @Override
    public void getMessage(String message) {
        retroApi.home()
                .compose(RxUtils.<BaseBackData>applySchedulers())
                .subscribe(new Observer<BaseBackData>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(BaseBackData baseBackData) {
                        view.showMessage(baseBackData.message);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

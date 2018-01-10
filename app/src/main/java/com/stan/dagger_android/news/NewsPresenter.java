package com.stan.dagger_android.news;

import android.util.Log;

import com.stan.dagger_android.data.BaseBackData;
import com.stan.dagger_android.net.RetroApi;
import com.stan.dagger_android.util.RxUtils;

import javax.inject.Inject;

import io.reactivex.functions.Consumer;

/**
 * Created by uu on 2017/12/29.
 */

public class NewsPresenter implements ActivityNewsContract.Presenter {

    public static final String TAG = "NewsPresenter";

    //view not inject
    ActivityNewsContract.View view;

    @Inject
    RetroApi retrofit;

    @Inject
    public NewsPresenter() {
    }


    @Override
    public void takeView(ActivityNewsContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        this.view = null;
    }

    @Override
    public void getMessage(String message) {
        retrofit.getApi()
                .home()
                .compose(RxUtils.<BaseBackData>applySchedulers())
                .subscribe(new Consumer<BaseBackData>() {
                    @Override
                    public void accept(BaseBackData baseBackData) throws Exception {
                        view.showMessage(baseBackData.message);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e(TAG,"Exception :"+throwable);
                    }
                });
    }
}

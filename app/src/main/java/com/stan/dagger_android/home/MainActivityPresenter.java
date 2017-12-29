package com.stan.dagger_android.home;

import javax.inject.Inject;

/**
 * Created by uu on 2017/12/29.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Inject
    public MainActivityPresenter(){
    }

    @Override
    public void takeView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }

    @Override
    public boolean isDataMissing() {
        return true;
    }
}

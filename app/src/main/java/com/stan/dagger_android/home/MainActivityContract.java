package com.stan.dagger_android.home;

import com.stan.dagger_android.base.BasePresenter;
import com.stan.dagger_android.base.BaseView;

/**
 * Created by uu on 2017/12/29.
 */

public interface MainActivityContract {
    interface View extends BaseView<Presenter> {
        boolean isActive();
    }
    interface Presenter extends BasePresenter<View>{
        boolean isDataMissing();
    }
}

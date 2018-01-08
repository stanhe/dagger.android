package com.stan.dagger_android.news;

import com.stan.dagger_android.base.BasePresenter;
import com.stan.dagger_android.base.BaseView;

/**
 * Created by uu on 2017/12/29.
 */

public interface ActivityNewsContract {
    interface View extends BaseView<Presenter>{
        void showMessage(String  message);
    }

    interface Presenter extends BasePresenter<View>{
        void getMessage(String message);
    }
}

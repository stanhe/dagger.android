package com.stan.dagger_android.news;

import com.stan.dagger_android.base.BasePresenter;
import com.stan.dagger_android.base.BaseView;
import com.stan.dagger_android.data.News;

/**
 * Created by uu on 2017/12/29.
 */

public interface ActivityNewsContract {
    interface View extends BaseView<Presenter>{
        void showNews(News news);
    }

    interface Presenter extends BasePresenter<View>{
        void getNews(int id);
    }
}

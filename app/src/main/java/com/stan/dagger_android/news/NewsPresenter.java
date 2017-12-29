package com.stan.dagger_android.news;

import com.stan.dagger_android.data.News;
import com.stan.dagger_android.net.MyRetrofit;
import com.stan.dagger_android.util.RxUtils;

import javax.inject.Inject;
import io.reactivex.functions.Consumer;

/**
 * Created by uu on 2017/12/29.
 */

public class NewsPresenter implements ActivityNewsContract.Presenter {

    @Inject MyRetrofit retrofit;

    @Inject ActivityNewsContract.View view;

    @Inject
    public NewsPresenter() {
    }


    @Override
    public void getNews(int id) {
       /* retrofit.getApi().getNews(id)
                .compose(RxUtils.<News>applySchedulers())
                .subscribe(new Consumer<News>() {
                    @Override
                    public void accept(News news) throws Exception {
                        view.showNews(news);
                    }
                });*/
        News news = new News();
        news.title = id+"";
        news.content = id+"";
        view.showNews(news);
    }

    @Override
    public void takeView(ActivityNewsContract.View view) {

    }

    @Override
    public void dropView() {

    }
}

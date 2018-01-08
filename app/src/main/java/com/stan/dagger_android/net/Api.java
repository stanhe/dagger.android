package com.stan.dagger_android.net;

import com.stan.dagger_android.data.BaseBackData;
import com.stan.dagger_android.data.News;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by uu on 2017/12/29.
 */

public interface Api {

    @GET("student/{id}")
    Observable<News> getNews(
            @Path("id")int id
    );

    @GET("/home")
    Observable<BaseBackData> home();
}

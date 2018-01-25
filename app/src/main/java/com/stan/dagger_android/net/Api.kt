package com.stan.dagger_android.net

import com.stan.dagger_android.data.BaseBackData
import com.stan.dagger_android.data.News

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by uu on 2017/12/29.
 */

interface Api {

    @GET("student/{id}")
    fun getNews(
            @Path("id") id: Int
    ): Observable<News>

    @GET("/home")
    fun home(): Observable<BaseBackData>
}

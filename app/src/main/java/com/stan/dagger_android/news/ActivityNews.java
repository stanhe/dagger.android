package com.stan.dagger_android.news;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.stan.dagger_android.base.BaseActivity;
import com.stan.dagger_android.data.News;

import javax.inject.Inject;

/**
 * Created by uu on 2017/12/29.
 */

public class ActivityNews extends BaseActivity implements ActivityNewsContract.View {


    @Inject
    ActivityNewsContract.Presenter presenter;

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }


    @Override
    public void showNews(News news) {

    }
}

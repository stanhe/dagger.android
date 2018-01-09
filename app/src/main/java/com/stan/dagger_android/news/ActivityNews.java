package com.stan.dagger_android.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.stan.dagger_android.R;
import com.stan.dagger_android.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by uu on 2017/12/29.
 */

public class ActivityNews extends BaseActivity implements ActivityNewsContract.View {

    public static final String TAG = "ActivityNews";

    @Inject
    ActivityNewsContract.Presenter presenter;

    @BindView(R.id.message)
    TextView message;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    @OnClick(R.id.message)
    public void clickMessage() {
        presenter.getMessage("getMessage!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.takeView(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.dropView();
    }

    @Override
    public void showMessage(String message) {
        this.message.setText(message);
    }

}

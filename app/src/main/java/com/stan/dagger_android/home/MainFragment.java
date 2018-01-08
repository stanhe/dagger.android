package com.stan.dagger_android.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stan.dagger_android.R;
import com.stan.dagger_android.base.BaseFragment;
import com.stan.dagger_android.data.Student;
import com.stan.dagger_android.di.ActivityScoped;
import com.stan.dagger_android.news.ActivityNews;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by uu on 2017/12/29.
 */
@ActivityScoped
public class MainFragment extends BaseFragment implements MainActivityContract.View{

    @Inject
    MainActivityContract.Presenter presenter;
    @Inject
    Context context;
    @Inject
    Student student;


    @BindView(R.id.text)
    TextView textView;

    @Inject
    public MainFragment() {

    }

    @OnClick(R.id.text)
    public void clickText() {
        startActivity(new Intent(getActivity(),ActivityNews.class));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }


    @Override
    public void onResume() {
        super.onResume();
        presenter.takeView(this);
    }

    @Override
    public void onPause() {
        presenter.dropView();
        super.onPause();
    }

    @Override
    public boolean isActive() {
        return isAdded();
    }


    @Override
    public void initView() {
        textView.setText(student.name);
    }
}

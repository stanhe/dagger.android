package com.stan.dagger_android.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;

/**
 * Created by uu on 2017/12/29.
 */

public abstract class BaseFragment extends DaggerFragment {
    Unbinder unbinder;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this,view);
        initView();
    }

    public abstract void initView();

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}

package com.stan.dagger_android.home;

import android.os.Bundle;

import com.stan.dagger_android.R;
import com.stan.dagger_android.base.BaseActivity;
import com.stan.dagger_android.util.ActivityUtils;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    public static final String TAG = "MainActivity";

   @Inject
   MainFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment fragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (fragment == null) {
            fragment = this.fragment;
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),fragment,R.id.contentFrame);
        }

    }
}

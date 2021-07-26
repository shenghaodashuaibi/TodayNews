package com.shenghao.todaynews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shenghao.todaynews.R;
import com.shenghao.todaynews.base.BaseActivity;
import com.shenghao.todaynews.base.BasePresenter;

/**
 * 闪屏页
 */
public class SplashActivity extends BaseActivity {

    protected BasePresenter createPresenter() {return null;}

    @Override
    protected int provideContentViewId() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}

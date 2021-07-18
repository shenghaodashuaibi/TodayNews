package com.shenghao.todaynews.app;

import com.github.anzewei.parallaxbacklayout.ParallaxHelper;
import com.shenghao.todaynews.BuildConfig;
import com.shenghao.todaynews.app.base.BaseApp;
import com.socks.library.KLog;

import org.litepal.LitePalApplication;

public class MyApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 相关第三方SDK的初始化等操作
         */
        KLog.init(BuildConfig.DEBUG); //初始化KLog
        LitePalApplication.initialize(getApplicationContext());  //初始化litePal

        registerActivityLifecycleCallbacks(ParallaxHelper.getInstance());
    }
}

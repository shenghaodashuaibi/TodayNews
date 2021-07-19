package com.shenghao.todaynews.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 网络工具类
 */
public class NetWorkUtils {

    public  static boolean isNetworkAvailable(Context context){
        if(context != null){
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = cm.getActiveNetworkInfo();
            if(info != null){
                return info.isAvailable();
            }
        }
        return false;
    }
}

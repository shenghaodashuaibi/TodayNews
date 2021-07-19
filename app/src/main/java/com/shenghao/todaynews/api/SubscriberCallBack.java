package com.shenghao.todaynews.api;

import android.text.TextUtils;

import com.shenghao.todaynews.model.response.ResultResponse;
import com.shenghao.todaynews.utils.UIUtils;
import com.socks.library.KLog;

import rx.Subscriber;

/**
 * 抽取callback
 */
public abstract class SubscriberCallBack<T> extends Subscriber<ResultResponse<T>> {

    @Override
    public void onNext(ResultResponse<T> tResultResponse) {
        boolean isSuccess = (!TextUtils.isEmpty(tResultResponse.message) &&
                tResultResponse.message.equals("success")) || !TextUtils.isEmpty(tResultResponse.success)
                && tResultResponse.success.equals("true");
        if(isSuccess){
            onSuccess((T) tResultResponse.data);
        }else{
            UIUtils.showToast(tResultResponse.message);
        }
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        KLog.e(e.getLocalizedMessage());
        onError();
    }

    protected abstract void onSuccess(T response);
    protected abstract void onError();

    protected void onFailure(ResultResponse response){

    }
}

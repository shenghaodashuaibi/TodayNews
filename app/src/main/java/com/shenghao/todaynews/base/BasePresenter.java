package com.shenghao.todaynews.base;

import com.shenghao.todaynews.api.ApiRetrofit;
import com.shenghao.todaynews.api.ApiService;


import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<V> {

    protected ApiService mApiService = ApiRetrofit.getInstance().getmApiService();
    protected V mView;
    private CompositeSubscription mCompositeSubscription;

    public BasePresenter(V view){
        attachView(view);
    }

    public void attachView(V view){
        mView = view;
    }

    public void detachView(){
        mView = null;
        onUnsubscribe();
    }

    public void addSubscription(Observable observable, Subscriber subscriber){
        if (mCompositeSubscription == null){
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

    public void onUnsubscribe(){
        if (mCompositeSubscription != null &&
                    mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }
}

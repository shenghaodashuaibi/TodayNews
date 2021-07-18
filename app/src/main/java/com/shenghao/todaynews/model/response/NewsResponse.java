package com.shenghao.todaynews.model.response;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.shenghao.todaynews.model.entity.NewsData;
import com.shenghao.todaynews.model.entity.TipEntity;

import java.util.List;

public class NewsResponse {

    public int login_status;
    public int total_number;
    public boolean has_more;
    public String post_content_hint;
    public int show_et_status;
    public int feed_flag;
    public int action_to_last_stick;
    public String message;
    public boolean has_more_to_refresh;

    public TipEntity tips;
    public List<NewsData> data;

    @NonNull
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

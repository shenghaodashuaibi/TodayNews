package com.shenghao.todaynews.model.response;

import com.shenghao.todaynews.model.entity.CommentData;

import java.util.List;

public class CommentResponse {

    public int total_number;
    public boolean has_more;
    public List<CommentData> data;
}

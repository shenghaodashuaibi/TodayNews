package com.shenghao.todaynews.model.response;

import java.util.List;

/**
 * 视频解析返回
 */
public class VideoPathResponse {

    public String status;
    public List<VideoEntity> video;

    public class VideoEntity{
        public String url;
    }
}

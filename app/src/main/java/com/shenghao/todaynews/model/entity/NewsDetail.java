package com.shenghao.todaynews.model.entity;

/**
 * 新闻详情
 */
public class NewsDetail {

    public String detail_source;
    public MediaUserBean mediaUserBean;
    public int publish_time;
    public String title;
    public String url;
    public boolean is_original;
    public boolean is_pgc_article;
    public String content;
    public String source;
    public int video_play_count;


    public static class MediaUserBean{
        public boolean no_display_pgc_icon;
        public String avatar_url;
        public String id;
        public String screen_name;
    }
}

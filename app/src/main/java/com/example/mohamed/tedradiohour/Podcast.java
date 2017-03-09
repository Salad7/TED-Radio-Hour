package com.example.mohamed.tedradiohour;

/**
 * Created by mohamed on 3/9/17.
 */

public class Podcast {

    String title, desc, pubdate, url, duration, mp3url;

    Podcast(){

    }

    public Podcast(String title, String desc, String pubdate, String url, String duration, String mp3url) {
        this.title = title;
        this.desc = desc;
        this.pubdate = pubdate;
        this.url = url;
        this.duration = duration;
        this.mp3url = mp3url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMp3url() {
        return mp3url;
    }

    public void setMp3url(String mp3url) {
        this.mp3url = mp3url;
    }
}

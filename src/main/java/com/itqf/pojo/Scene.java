package com.itqf.pojo;

public class Scene {
    private Integer sceneid;

    private String scenename;

    private Integer status;

    private String imgurl;

    private String ifon;

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename == null ? null : scenename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getIfon() {
        return ifon;
    }

    public void setIfon(String ifon) {
        this.ifon = ifon == null ? null : ifon.trim();
    }
}
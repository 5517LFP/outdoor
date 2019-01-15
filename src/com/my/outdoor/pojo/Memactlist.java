package com.my.outdoor.pojo;

public class Memactlist {
    private Integer maid;

    private Integer aid;

    private String aname;

    private String alinename;

    private String aproject;

    private Integer mid;

    private String mname;

    public Integer getMaid() {
        return maid;
    }

    public void setMaid(Integer maid) {
        this.maid = maid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAlinename() {
        return alinename;
    }

    public void setAlinename(String alinename) {
        this.alinename = alinename == null ? null : alinename.trim();
    }

    public String getAproject() {
        return aproject;
    }

    public void setAproject(String aproject) {
        this.aproject = aproject == null ? null : aproject.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }
}
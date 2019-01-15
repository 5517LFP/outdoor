package com.my.outdoor.pojo;

public class Benlist {
    private Integer bid;

    private String bname;

    private String bphone;

    private String bactivename;

    private String bactivetime;

    private String bjust;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone == null ? null : bphone.trim();
    }

    public String getBactivename() {
        return bactivename;
    }

    public void setBactivename(String bactivename) {
        this.bactivename = bactivename == null ? null : bactivename.trim();
    }

    public String getBactivetime() {
        return bactivetime;
    }

    public void setBactivetime(String bactivetime) {
        this.bactivetime = bactivetime == null ? null : bactivetime.trim();
    }

    public String getBjust() {
        return bjust;
    }

    public void setBjust(String bjust) {
        this.bjust = bjust == null ? null : bjust.trim();
    }
}
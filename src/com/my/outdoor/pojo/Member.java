package com.my.outdoor.pojo;

public class Member {
    private Integer hid;

    private String hname;

    private String hpwd;

    private String hphonenumber;

    private String hlv;

    private String hidcard;

    private String hemail;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getHpwd() {
        return hpwd;
    }

    public void setHpwd(String hpwd) {
        this.hpwd = hpwd == null ? null : hpwd.trim();
    }

    public String getHphonenumber() {
        return hphonenumber;
    }

    public void setHphonenumber(String hphonenumber) {
        this.hphonenumber = hphonenumber == null ? null : hphonenumber.trim();
    }

    public String getHlv() {
        return hlv;
    }

    public void setHlv(String hlv) {
        this.hlv = hlv == null ? null : hlv.trim();
    }

    public String getHidcard() {
        return hidcard;
    }

    public void setHidcard(String hidcard) {
        this.hidcard = hidcard == null ? null : hidcard.trim();
    }

    public String getHemail() {
        return hemail;
    }

    public void setHemail(String hemail) {
        this.hemail = hemail == null ? null : hemail.trim();
    }
}
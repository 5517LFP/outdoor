package com.my.outdoor.pojo;

public class Safestronger {
    private Integer ssid;

    private String ssname;

    private String sslv;

    private String sscontent;

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname == null ? null : ssname.trim();
    }

    public String getSslv() {
        return sslv;
    }

    public void setSslv(String sslv) {
        this.sslv = sslv == null ? null : sslv.trim();
    }

    public String getSscontent() {
        return sscontent;
    }

    public void setSscontent(String sscontent) {
        this.sscontent = sscontent == null ? null : sscontent.trim();
    }
}
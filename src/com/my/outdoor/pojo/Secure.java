package com.my.outdoor.pojo;

public class Secure {
    private Integer seid;

    private String sename;

    private String selv;

    private String semoney;

    private String secompany;

    private Integer seneedmoney;

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename == null ? null : sename.trim();
    }

    public String getSelv() {
        return selv;
    }

    public void setSelv(String selv) {
        this.selv = selv == null ? null : selv.trim();
    }

    public String getSemoney() {
        return semoney;
    }

    public void setSemoney(String semoney) {
        this.semoney = semoney == null ? null : semoney.trim();
    }

    public String getSecompany() {
        return secompany;
    }

    public void setSecompany(String secompany) {
        this.secompany = secompany == null ? null : secompany.trim();
    }

    public Integer getSeneedmoney() {
        return seneedmoney;
    }

    public void setSeneedmoney(Integer seneedmoney) {
        this.seneedmoney = seneedmoney;
    }
}
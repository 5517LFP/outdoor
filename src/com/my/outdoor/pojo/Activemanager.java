package com.my.outdoor.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activemanager {
    private Integer aid;

    private String aname;

    private String aline;

    private String asecure;

    private String adangerous;

    private String astronger;

    private String aproject;

    private String activestatues;

    private String acontent;

    private String apicture;

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

    public String getAline() {
        return aline;
    }

    public void setAline(String aline) {
        this.aline = aline == null ? null : aline.trim();
    }

    public String getAsecure() {
        return asecure;
    }

    public void setAsecure(String asecure) {
        this.asecure = asecure == null ? null : asecure.trim();
    }

    public String getAdangerous() {
        return adangerous;
    }

    public void setAdangerous(String adangerous) {
        this.adangerous = adangerous == null ? null : adangerous.trim();
    }

    public String getAstronger() {
        return astronger;
    }

    public void setAstronger(String astronger) {
        this.astronger = astronger == null ? null : astronger.trim();
    }

    public String getAproject() {
        return aproject;
    }

    public void setAproject(String aproject) {
        this.aproject = aproject == null ? null : aproject.trim();
    }

    public String getActivestatues() {
        return activestatues;
    }

    public void setActivestatues(String activestatues) {
        this.activestatues = activestatues == null ? null : activestatues.trim();
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent == null ? null : acontent.trim();
    }

    public String getApicture() {
        return apicture;
    }

    public void setApicture(String apicture) {
        this.apicture = apicture == null ? null : apicture.trim();
    }
}
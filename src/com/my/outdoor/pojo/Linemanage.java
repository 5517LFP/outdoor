package com.my.outdoor.pojo;

public class Linemanage {
    private Integer lid;

    private String linename;

    private String linecontent;

    private String linetype;

    private Integer abouttime;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getLinecontent() {
        return linecontent;
    }

    public void setLinecontent(String linecontent) {
        this.linecontent = linecontent == null ? null : linecontent.trim();
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    public Integer getAbouttime() {
        return abouttime;
    }

    public void setAbouttime(Integer abouttime) {
        this.abouttime = abouttime;
    }
}
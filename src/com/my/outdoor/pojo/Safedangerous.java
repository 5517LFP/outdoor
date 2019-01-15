package com.my.outdoor.pojo;

public class Safedangerous {
    private Integer sdid;

    private String sdname;

    private Integer sdlv;

    private String sdcontent;

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public String getSdname() {
        return sdname;
    }

    public void setSdname(String sdname) {
        this.sdname = sdname == null ? null : sdname.trim();
    }

    public Integer getSdlv() {
        return sdlv;
    }

    public void setSdlv(Integer sdlv) {
        this.sdlv = sdlv;
    }

    public String getSdcontent() {
        return sdcontent;
    }

    public void setSdcontent(String sdcontent) {
        this.sdcontent = sdcontent == null ? null : sdcontent.trim();
    }
}
package com.my.outdoor.pojo;

public class Project {
    private Integer pid;

    private String name;

    private String lvs;

    private String lvd;

    private String content;

    private String type;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLvs() {
        return lvs;
    }

    public void setLvs(String lvs) {
        this.lvs = lvs == null ? null : lvs.trim();
    }

    public String getLvd() {
        return lvd;
    }

    public void setLvd(String lvd) {
        this.lvd = lvd == null ? null : lvd.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
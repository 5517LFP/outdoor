package com.my.outdoor.pojo;

public class Staff {
    private Integer staid;

    private String name;

    private String pwd;

    private String encode;

    private String phone;

    private String job;

    private String indate;

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode == null ? null : encode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate == null ? null : indate.trim();
    }
}
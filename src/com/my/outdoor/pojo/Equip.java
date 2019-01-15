package com.my.outdoor.pojo;

public class Equip {
    private Integer eqid;

    private String name;

    private String onedayvalue;

    private String deposit;

    public Integer getEqid() {
        return eqid;
    }

    public void setEqid(Integer eqid) {
        this.eqid = eqid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOnedayvalue() {
        return onedayvalue;
    }

    public void setOnedayvalue(String onedayvalue) {
        this.onedayvalue = onedayvalue == null ? null : onedayvalue.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }
}
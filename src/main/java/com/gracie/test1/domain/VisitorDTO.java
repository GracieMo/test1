package com.gracie.test1.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class VisitorDTO {
    private String edubackground;

    private String marriage;

    private String incomelevel;

    private String health;

    private Integer vsid;

    private String vsname;

    private String vssex;

    @JsonFormat(locale="zh",timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date vsbirthday;

    private String vsphone;

    private String vsnative;

    private String nation;

    private String religion;

    private String emerperson;

    private Integer emerphone;

    private String job;

    private String unit;

    private String address;

    private String vsremarks;

    private Integer valid;

    public VisitorDTO(Visitor visitor){
        this.vsid=visitor.getVsid();

        this.vsname=visitor.getVsname();

        this.vsbirthday=visitor.getVsbirthday();

        this.vsphone=visitor.getVsphone();

        this.vsnative=visitor.getvsnative();

        this.nation=visitor.getNation();

        this.religion=visitor.getReligion();

        this.emerperson=visitor.getEmerperson();

        this.emerphone=visitor.getEmerphone();

        this.job=visitor.getJob();

        this.unit=visitor.getUnit();

        this.address=visitor.getAddress();

        this.vsremarks= visitor.getVsremarks();

        this.valid= visitor.getValid();
    }

    public String getEdubackground() {
        return edubackground;
    }

    public void setEdubackground(String edubackground) {
        this.edubackground = edubackground;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getIncomelevel() {
        return incomelevel;
    }

    public void setIncomelevel(String incomelevel) {
        this.incomelevel = incomelevel;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Integer getVsid() {
        return vsid;
    }

    public void setVsid(Integer vsid) {
        this.vsid = vsid;
    }

    public String getVsname() {
        return vsname;
    }

    public void setVsname(String vsname) {
        this.vsname = vsname;
    }

    public String getVssex() {
        return vssex;
    }

    public void setVssex(String vssex) {
        this.vssex = vssex;
    }

    public Date getVsbirthday() {
        return vsbirthday;
    }

    public void setVsbirthday(Date vsbirthday) {
        this.vsbirthday = vsbirthday;
    }

    public String getVsphone() {
        return vsphone;
    }

    public void setVsphone(String vsphone) {
        this.vsphone = vsphone;
    }

    public String getVsnative() {
        return vsnative;
    }

    public void setVsnative(String vsnative) {
        this.vsnative = vsnative;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getEmerperson() {
        return emerperson;
    }

    public void setEmerperson(String emerperson) {
        this.emerperson = emerperson;
    }

    public Integer getEmerphone() {
        return emerphone;
    }

    public void setEmerphone(Integer emerphone) {
        this.emerphone = emerphone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVsremarks() {
        return vsremarks;
    }

    public void setVsremarks(String vsremarks) {
        this.vsremarks = vsremarks;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}

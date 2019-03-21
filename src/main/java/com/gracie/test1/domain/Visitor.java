package com.gracie.test1.domain;

import java.util.Date;

public class Visitor {
    private Integer vsid;

    private String vsname;

    private Integer vssex;

    private Date vsbirthday;

    private Integer vsphone;

    private String vsnative;

    private String nation;

    private Integer edubackground;

    private Integer marriage;

    private String religion;

    private Integer incomelevel;

    private Integer health;

    private String emerperson;

    private Integer emerphone;

    private String job;

    private String unit;

    private String address;

    private String vsremarks;

    private Integer valid;

    public Visitor(Integer vsid, String vsname, Integer vssex, Date vsbirthday, Integer vsphone, String vsnative, String nation, Integer edubackground, Integer marriage, String religion, Integer incomelevel, Integer health, String emerperson, Integer emerphone, String job, String unit, String address, String vsremarks, Integer valid) {
        this.vsid = vsid;
        this.vsname = vsname;
        this.vssex = vssex;
        this.vsbirthday = vsbirthday;
        this.vsphone = vsphone;
        this.vsnative = vsnative;
        this.nation = nation;
        this.edubackground = edubackground;
        this.marriage = marriage;
        this.religion = religion;
        this.incomelevel = incomelevel;
        this.health = health;
        this.emerperson = emerperson;
        this.emerphone = emerphone;
        this.job = job;
        this.unit = unit;
        this.address = address;
        this.vsremarks = vsremarks;
        this.valid = valid;
    }

    public Visitor() {
        super();
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

    public Integer getVssex() {
        return vssex;
    }

    public void setVssex(Integer vssex) {
        this.vssex = vssex;
    }

    public Date getVsbirthday() {
        return vsbirthday;
    }

    public void setVsbirthday(Date vsbirthday) {
        this.vsbirthday = vsbirthday;
    }

    public Integer getVsphone() {
        return vsphone;
    }

    public void setVsphone(Integer vsphone) {
        this.vsphone = vsphone;
    }

    public String getvsnative() {
        return vsnative;
    }

    public void setvsnative(String vsnative) {
        this.vsnative = vsnative;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getEdubackground() {
        return edubackground;
    }

    public void setEdubackground(Integer edubackground) {
        this.edubackground = edubackground;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Integer getIncomelevel() {
        return incomelevel;
    }

    public void setIncomelevel(Integer incomelevel) {
        this.incomelevel = incomelevel;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
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
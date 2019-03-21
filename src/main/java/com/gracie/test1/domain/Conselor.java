package com.gracie.test1.domain;

import java.util.Date;

public class Conselor {
    private Integer csid;

    private String csname;

    private Integer cssex;

    private Date csbirthday;

    private Integer csphone;

    private Integer role;

    private String vsremarks;

    private Integer valid;

    public Conselor(Integer csid, String csname, Integer cssex, Date csbirthday, Integer csphone, Integer role, String vsremarks, Integer valid) {
        this.csid = csid;
        this.csname = csname;
        this.cssex = cssex;
        this.csbirthday = csbirthday;
        this.csphone = csphone;
        this.role = role;
        this.vsremarks = vsremarks;
        this.valid = valid;
    }

    public Conselor() {
        super();
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public String getCsname() {
        return csname;
    }

    public void setCsname(String csname) {
        this.csname = csname;
    }

    public Integer getCssex() {
        return cssex;
    }

    public void setCssex(Integer cssex) {
        this.cssex = cssex;
    }

    public Date getCsbirthday() {
        return csbirthday;
    }

    public void setCsbirthday(Date csbirthday) {
        this.csbirthday = csbirthday;
    }

    public Integer getCsphone() {
        return csphone;
    }

    public void setCsphone(Integer csphone) {
        this.csphone = csphone;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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
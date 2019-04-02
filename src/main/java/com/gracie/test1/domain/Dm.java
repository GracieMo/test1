package com.gracie.test1.domain;

public class Dm {
    private Integer dmid;

    private Integer dmx;

    private Integer dmm;

    private String mc;

    public Dm(Integer dmid, Integer dmx, Integer dmm, String mc) {
        this.dmid = dmid;
        this.dmx = dmx;
        this.dmm = dmm;
        this.mc = mc;
    }

    public Dm() {
        super();
    }

    public Integer getDmid() {
        return dmid;
    }

    public void setDmid(Integer dmid) {
        this.dmid = dmid;
    }

    public Integer getDmx() {
        return dmx;
    }

    public void setDmx(Integer dmx) {
        this.dmx = dmx;
    }

    public Integer getDmm() {
        return dmm;
    }

    public void setDmm(Integer dmm) {
        this.dmm = dmm;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }
}
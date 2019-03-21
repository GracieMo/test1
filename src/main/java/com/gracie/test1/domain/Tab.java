package com.gracie.test1.domain;

public class Tab {
    private Integer tabid;

    private Integer fid;

    private Integer sid;

    private String tabname;

    public Tab(Integer tabid, Integer fid, Integer sid, String tabname) {
        this.tabid = tabid;
        this.fid = fid;
        this.sid = sid;
        this.tabname = tabname;
    }

    public Tab() {
        super();
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }
}
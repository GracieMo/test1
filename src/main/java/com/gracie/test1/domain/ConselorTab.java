package com.gracie.test1.domain;

public class ConselorTab {
    private Integer cstabid;

    private Integer csid;

    private Integer tabid;

    public ConselorTab(Integer cstabid, Integer csid, Integer tabid) {
        this.cstabid = cstabid;
        this.csid = csid;
        this.tabid = tabid;
    }

    public ConselorTab() {
        super();
    }

    public Integer getCstabid() {
        return cstabid;
    }

    public void setCstabid(Integer cstabid) {
        this.cstabid = cstabid;
    }

    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }
}
package com.mybatis.entity;

public class MyBatisInttLdgr {

    private String useInttId;
    private String bizNo;
    private String useInttNm;

    // 기본 생성자
    public MyBatisInttLdgr() {}
    
    // 모든 필드를 초기화하는 생성자
    public MyBatisInttLdgr(String useInttId, String bizNo, String useInttNm) {
        this.useInttId = useInttId;
        this.bizNo = bizNo;
        this.useInttNm = useInttNm;
    }

    // getters and setters
    public String getUseInttId() {
        return useInttId;
    }

    public void setUseInttId(String useInttId) {
        this.useInttId = useInttId;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getUseInttNm() {
        return useInttNm;
    }

    public void setUseInttNm(String useInttNm) {
        this.useInttNm = useInttNm;
    }
}
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "intt_ldgr") // 실제 테이블명 매핑
public class InttLdgr {
    
	@Id
    @Column(name = "use_intt_id")//pk
    private String useInttId;

    @Column(name = "biz_no")
    private String bizNo;

    @Column(name = "use_intt_nm")
    private String useInttNm;

    // 기본 생성자
    public InttLdgr() {}

    // 모든 필드를 초기화하는 생성자
    public InttLdgr(String useInttId, String bizNo, String useInttNm) {
    	this.useInttId = useInttId;
        this.bizNo = bizNo;
        this.useInttNm = useInttNm;
    }

    
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
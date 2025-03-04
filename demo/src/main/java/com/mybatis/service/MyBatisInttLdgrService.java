package com.mybatis.service;

import com.mybatis.entity.MyBatisInttLdgr;
import com.mybatis.mapper.MyBatisInttLdgrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mybatisInttLdgrService") // ∫Û ¿Ã∏ß ¡ˆ¡§
public class MyBatisInttLdgrService {

    @Autowired
    private MyBatisInttLdgrMapper inttLdgrMapper;

    public int createInttLdgr(MyBatisInttLdgr inttLdgr) {
        return inttLdgrMapper.insertInttLdgr(inttLdgr);
    }

    public MyBatisInttLdgr getInttLdgrById(String useInttId) {
        return inttLdgrMapper.getInttLdgrById(useInttId);
    }

    public int updateInttLdgr(MyBatisInttLdgr inttLdgr) {
        return inttLdgrMapper.updateInttLdgr(inttLdgr);
    }

    public int deleteInttLdgr(String useInttId) {
        return inttLdgrMapper.deleteInttLdgr(useInttId);
    }

    public List<MyBatisInttLdgr> getAllInttLdgr() {
    	List<MyBatisInttLdgr> a = inttLdgrMapper.getAllInttLdgr();
    	
        return inttLdgrMapper.getAllInttLdgr();
    }
}
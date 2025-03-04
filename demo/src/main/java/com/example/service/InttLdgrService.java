package com.example.service;

import com.example.entity.InttLdgr;
import com.example.repository.InttLdgrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InttLdgrService {
    private final InttLdgrRepository inttLdgrRepository;

    // 생성자에서 의존성 주입
    @Autowired
    public InttLdgrService(InttLdgrRepository inttLdgrRepository) {
        this.inttLdgrRepository = inttLdgrRepository;
    }

    public List<InttLdgr> getAllInttLdgrs() {
        return inttLdgrRepository.findAll();
    }

    public List<InttLdgr> getByBizNo(String bizNo) {
        return inttLdgrRepository.findByBizNo(bizNo);
    }
    
    // InttLdgr 저장
    public InttLdgr saveInttLdgr(InttLdgr inttLdgr) {
        return inttLdgrRepository.save(inttLdgr);
    }
}
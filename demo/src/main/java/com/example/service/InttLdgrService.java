package com.example.service;

import com.example.entity.InttLdgr;
import com.example.repository.InttLdgrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InttLdgrService {
    private final InttLdgrRepository inttLdgrRepository;

    // �����ڿ��� ������ ����
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
    
    // InttLdgr ����
    public InttLdgr saveInttLdgr(InttLdgr inttLdgr) {
        return inttLdgrRepository.save(inttLdgr);
    }
}
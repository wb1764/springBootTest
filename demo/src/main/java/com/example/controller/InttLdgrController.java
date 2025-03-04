package com.example.controller;

import com.example.entity.InttLdgr;
import com.example.service.InttLdgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("exampleInttLdgrController") // 빈 이름 지정
@RequestMapping("/api/intt_ldgr")
public class InttLdgrController {
    private final InttLdgrService inttLdgrService;

    @Autowired
    public InttLdgrController(InttLdgrService inttLdgrService) {
        this.inttLdgrService = inttLdgrService;
    }

    // 전체 목록 조회
    @GetMapping
    public List<InttLdgr> getAllInttLdgrs() {
        return inttLdgrService.getAllInttLdgrs();
    }

    // 특정 사업자번호로 조회
    @GetMapping("/search")
    public List<InttLdgr> getByBizNo(@RequestParam(value="bizNo") String bizNo) {
        return inttLdgrService.getByBizNo(bizNo);
    }
    
    // InttLdgr 추가 (POST)
    @PostMapping
    public InttLdgr createInttLdgr(@RequestBody InttLdgr inttLdgr) {
        return inttLdgrService.saveInttLdgr(inttLdgr);
    }
}
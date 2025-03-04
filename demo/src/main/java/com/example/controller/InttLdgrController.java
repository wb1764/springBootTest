package com.example.controller;

import com.example.entity.InttLdgr;
import com.example.service.InttLdgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("exampleInttLdgrController") // �� �̸� ����
@RequestMapping("/api/intt_ldgr")
public class InttLdgrController {
    private final InttLdgrService inttLdgrService;

    @Autowired
    public InttLdgrController(InttLdgrService inttLdgrService) {
        this.inttLdgrService = inttLdgrService;
    }

    // ��ü ��� ��ȸ
    @GetMapping
    public List<InttLdgr> getAllInttLdgrs() {
        return inttLdgrService.getAllInttLdgrs();
    }

    // Ư�� ����ڹ�ȣ�� ��ȸ
    @GetMapping("/search")
    public List<InttLdgr> getByBizNo(@RequestParam(value="bizNo") String bizNo) {
        return inttLdgrService.getByBizNo(bizNo);
    }
    
    // InttLdgr �߰� (POST)
    @PostMapping
    public InttLdgr createInttLdgr(@RequestBody InttLdgr inttLdgr) {
        return inttLdgrService.saveInttLdgr(inttLdgr);
    }
}
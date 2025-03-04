package com.mybatis.controller;

import com.mybatis.entity.MyBatisInttLdgr;
import com.mybatis.service.MyBatisInttLdgrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("mybatisInttLdgrController") // ∫Û ¿Ã∏ß ¡ˆ¡§
@RequestMapping("/mybatis/intt_ldgr")
public class MyBatisInttLdgrController {

    @Autowired
    private MyBatisInttLdgrService inttLdgrService;

    @PostMapping
    public int createInttLdgr(@RequestBody MyBatisInttLdgr inttLdgr) {
        return inttLdgrService.createInttLdgr(inttLdgr);
    }

    @GetMapping("/{useInttId}")
    public MyBatisInttLdgr getInttLdgr(@PathVariable(value="useInttId") String useInttId) {
        return inttLdgrService.getInttLdgrById(useInttId);
    }

    @PutMapping
    public int updateInttLdgr(@RequestBody MyBatisInttLdgr inttLdgr) {
        return inttLdgrService.updateInttLdgr(inttLdgr);
    }

    @DeleteMapping("/{useInttId}")
    public int deleteInttLdgr(@PathVariable(value="useInttId") String useInttId) {
        return inttLdgrService.deleteInttLdgr(useInttId);
    }

    @GetMapping
    public List<MyBatisInttLdgr> getAllInttLdgr() {
        return inttLdgrService.getAllInttLdgr();
    }
}
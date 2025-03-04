package com.example.repository;

import com.example.entity.InttLdgr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InttLdgrRepository extends JpaRepository<InttLdgr, String> {
    List<InttLdgr> findByBizNo(String bizNo);
}
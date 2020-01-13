package com.test.rule.dao;

import com.test.rule.bean.Data1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data1Dao extends JpaRepository<Data1, Long> {
}

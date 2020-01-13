package com.test.rule.dao;

import com.test.rule.bean.Rule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleDao extends JpaRepository<Rule, Long> {
}

//package com.test.rule;
//
//import com.googlecode.aviator.AviatorEvaluator;
//import com.test.rule.bean.Rule;
//import com.test.rule.dao.RuleDao;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class RuleApplicationTests {
//    @Autowired
//    private RuleDao ruleDao;
//
//
//    @Test
//    public void conxtLoads() {
//        Rule rule = ruleDao.findById(1L).get();
//        String expression = rule.getExpression();
//        //传入参数dd获取结果
//        expression = expression.replaceAll("\\?", "A");
//        System.out.println(AviatorEvaluator.execute(expression));
//    }
//
//}

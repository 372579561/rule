package com.test.rule.controller;

import com.googlecode.aviator.AviatorEvaluator;
import com.test.rule.bean.Rule;
import com.test.rule.dao.RuleDao;
import com.test.rule.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class DataController {

    @Autowired
    private DataService dataService;

    @Autowired
    private RuleDao ruleDao;


    @RequestMapping("/1")
    private void test() {
        Rule rule = ruleDao.findById(1L).get();
        System.out.println(dataService);
        String expression = rule.getExpression();
        //传入参数dd获取结果
        expression = expression.replaceAll("\\?", "A");
        System.out.println(AviatorEvaluator.execute(expression));
    }

}

package com.test.rule.function;

import com.googlecode.aviator.AviatorEvaluator;

public class Test {
    public static void main(String[] args) {
        System.out.println(AviatorEvaluator.execute("equales(getData(?,?,score),getData(?,?,score),number)"));
        System.out.println(AviatorEvaluator.execute("range(3,5,6)"));
    }

}

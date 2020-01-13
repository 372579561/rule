package com.test.rule.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

public class EqualsFunction extends AbstractFunction {
    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2, AviatorObject arg3) {
        String type = FunctionUtils.getStringValue(arg3, env);
        if ("number".equals(type)) {
            Number a = FunctionUtils.getNumberValue(arg1, env);
            Number b = FunctionUtils.getNumberValue(arg2, env);
            return a.equals(b) ? AviatorBoolean.TRUE : AviatorBoolean.FALSE;
        }
        //todo
        //其他类型处理可以改为工厂模式，目前只处理double
        return null;
    }

    @Override
    public String getName() {
        return "equales";
    }
}

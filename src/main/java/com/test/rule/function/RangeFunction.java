package com.test.rule.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

public class RangeFunction extends AbstractFunction {
    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2, AviatorObject arg3) {
        Number a = FunctionUtils.getNumberValue(arg1, env);
        Number b = FunctionUtils.getNumberValue(arg2, env);
        Number c = FunctionUtils.getNumberValue(arg3, env);
        if (c.doubleValue() > b.doubleValue() && c.doubleValue() < a.doubleValue()) {
            return AviatorBoolean.TRUE;
        }
        if (c.doubleValue() < b.doubleValue() && c.doubleValue() > a.doubleValue()) {
            return AviatorBoolean.TRUE;
        }
        return AviatorBoolean.FALSE;
    }

    @Override
    public String getName() {
        return "range";
    }
}

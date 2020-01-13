package com.test.rule.function;


import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBoolean;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;
import com.test.rule.bean.Data1;
import com.test.rule.bean.Data2;
import com.test.rule.service.DataService;
import com.test.rule.utils.SpringContextUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

@Service
public class GetDataFunction extends AbstractFunction {


    @Override
    public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2, AviatorObject arg3) {
        String dataSource = FunctionUtils.getStringValue(arg1, env);
        String serviceCode = FunctionUtils.getStringValue(arg2, env);
        String filed = FunctionUtils.getStringValue(arg3, env);
        Object data = getData(dataSource, serviceCode);
        Class clasx = getClass(dataSource, serviceCode);
        Method method = null;
        Object value = null;
        try {
            method = clasx.getDeclaredMethod("get"+ StringUtils.capitalize(filed));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            value =method.invoke(data);
        }  catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //暂时只写对double处理
        if (value instanceof Double) {
            return new AviatorDouble(Double.valueOf(String.valueOf(value)));
        }
        return AviatorBoolean.FALSE;
    }

    @Override
    public String getName() {
        return "getData";
    }

    private Object getData(String dataSource, String serviceCode) {
        DataService dataService = (DataService) SpringContextUtils.getContext().getBean("dataService");
        if ("A".equals(dataSource)) {
            return dataService.findById(Long.valueOf(serviceCode));
        }
        //数据源查询数据操作
        return dataService.findById(Long.valueOf(serviceCode));
    }

    private String compoundKeys(String... keys) {
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(key);
        }
        return sb.toString();
    }

    /**
     * 伪代码 ，实际需要缓存类
     */
    private Class getClass(String dataSource, String serviceCode) {
        if ("A".equals(dataSource)) {
            return Data1.class;
        }
        return Data2.class;
    }
}

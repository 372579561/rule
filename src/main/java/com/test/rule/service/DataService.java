package com.test.rule.service;

import com.test.rule.dao.Data1Dao;
import com.test.rule.dao.Data2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DataService {

    private final Data1Dao data1Dao;

    private final Data2Dao data2Dao;

    @Autowired
    public DataService(Data1Dao data1Dao, Data2Dao data2Dao) {
        this.data1Dao = data1Dao;
        this.data2Dao = data2Dao;
    }

    public Object findById(Long l) {
        return data1Dao.findById(l).get();
    }
}

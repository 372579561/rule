package com.test.rule.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_r_rule")
public class Rule {
    @Id
    private long id;
    private int strategy_id;
    private String name;
    private String description;
    private byte type;
    private String expression;
    private String amount;
    private String exhibition;
    private String function;
    private int pattern;
    private String priority;
    private byte status;
    private String create_time;
    private String update_time;
    private float weight;
    private int data_type;
    private String version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(int strategy_id) {
        this.strategy_id = strategy_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExhibition() {
        return exhibition;
    }

    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getData_type() {
        return data_type;
    }

    public void setData_type(int data_type) {
        this.data_type = data_type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}



















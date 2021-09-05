package com.jayce.es.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author jayce
 */
@Data
public class Cloth {

    private String id;

    private String name;

    private String desc;

    private Integer num;

    private double price;

    @JSONField(ordinal = 5, format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public Cloth(String id, String name, String desc, Integer num, double price, Date date) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.num = num;
        this.price = price;
        this.date = date;
    }
}

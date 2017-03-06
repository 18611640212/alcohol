package com.customer.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hpf on 2017/2/4.
 */
@Getter
@Setter
public class Car {

    /**
     * 编号
     */
    private String carId;
    /**
     * 车型
     */
    private String carModel;
    /**
     * 颜色
     */
    private String color;
    /**
     * 车主ID
     */
    private String customerId;
    /**
     * 保险开始日期
     */
    private String insuranceStartDate;
    /**
     * 保险结束日期
     */
    private String insuranceEndDate;

}

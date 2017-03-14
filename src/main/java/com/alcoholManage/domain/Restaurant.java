package com.alcoholManage.domain;

import com.alcoholManage.enums.StyleOfCooking;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by mac on 2017/3/12.
 * 餐厅实体类
 */

@Getter
@Setter
public class Restaurant {
    /**
     * 餐厅名称
     */
    private String restaurantName;

    /**
     * 菜系
     */
    private StyleOfCooking styleOfCooking;

    /**
     * 人均价格
     */
    private long perCapita;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 位置X轴
     */
    private String locationX;
    /**
     * 位置Y轴
     */
    private String locationY;

    /**
     * 是否营业
     */
    private boolean isDoBusiness;





}

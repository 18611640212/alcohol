package com.alcoholManage.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by mac on 2017/3/12.
 */


@Getter
@Setter
public class ReservationBill {


    /**
     * 用户UUID
     */
    private String uuid;
    /**
     * 预约单号
     */
    private String reservationId;
    /**
     * 预约时间
     */
    private Date reservateDate;



}

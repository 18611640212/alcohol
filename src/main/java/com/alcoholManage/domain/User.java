package com.customer.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hpf on 2017/1/24.
 */
@Getter
@Setter
public class User {

    private String userName;

    private String password;

    /**
     * 别名，用户的显示名称
     */
    private String alias;

}

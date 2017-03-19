package com.alcoholManage.accessToken;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Created by mac on 2017/3/19.
 */
@Getter
@Setter
public class TokenManage {
    /**
     * 微信公众平台提供的token
     */
    private String token;



}

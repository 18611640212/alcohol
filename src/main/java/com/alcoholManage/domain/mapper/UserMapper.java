package com.alcoholManage.domain.mapper;

import com.alcoholManage.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by hpf on 2017/1/24.
 */
@Repository
public interface UserMapper {


    /**
     * 新建用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 修改用户信息
     * @param user
     */
    void updateUser(User user);
    /**
     * 根据uuid获取用户信息
     * @param uuid
     * @return
     */
    User getUserByUUID(String uuid);

    /**
     * 根据账号密码获取用户信息
     * @param userName
     * @param password
     * @return
     */
    User getUserByPassword(String userName,String password);
}

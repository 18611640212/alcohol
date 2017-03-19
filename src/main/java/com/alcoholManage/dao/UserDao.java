package com.alcoholManage.dao;

import com.alcoholManage.domain.User;
import com.alcoholManage.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by mac on 2017/3/18.
 */
@Repository
public class UserDao {


    @Autowired
    private UserMapper userMapper;
    /**
     * 新建用户
     * @param user
     */
    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    /**
     * 修改用户信息
     * @param user
     */
    public void updateUser(User user){
        userMapper.updateUser(user);
    }
    /**
     * 根据uuid获取用户信息
     * @param uuid
     * @return
     */
    public User getUserByUUID(String uuid){
        return userMapper.getUserByUUID(uuid);
    }

    /**
     * 根据账号密码获取用户信息
     * @param userName
     * @param password
     * @return
     */
    public User getUserByPassword(String userName,String password){
        return userMapper.getUserByPassword(userName,password);
    }


}

package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author 张强
 * @version 1.0
 * @description com.miaoshaproject.service
 * @date 2019/6/10  0:30
 */
public interface UserService {
    //通过用户id获取用户对象
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    /*
telephone:用户注册手机
encrptPassowrd:用户加密后的密码
 */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}

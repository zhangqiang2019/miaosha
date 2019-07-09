package com.miaoshaproject.error;

/**
 * @author 张强
 * @version 1.0
 * @description com.miaoshaproject.error
 * @date 2019/6/11  0:20
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}

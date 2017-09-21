package com.hbzz.service;

import com.hbzz.domain.User;

/**
 * User服务层接口
 */
public interface UserService {

    /**
     * 判断用户登录
     * @param loginname
     * @param passward
     * @return 找到返回的User对象，没找到返回null
     */
    User login(String loginname,String passward);
}

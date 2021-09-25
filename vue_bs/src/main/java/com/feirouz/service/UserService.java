package com.feirouz.service;

import com.feirouz.entity.User;

import java.util.List;

/**
 * @description:
 * @author: Feirouz
 * @date: 2021-09-25 13:48
 */
public interface UserService {
    // 查询所有用户
    List<User> findAll();

    // 保存用户
    void save(User user);

    // 根据id删除用户
    void delete(String id);

    // 根据id查询用户
    User findUser(String id);

    // 修改用户信息
    void updateUser(User user);

    // 模糊搜索
    List<User> findNameOrPhoneCode(String name, String phoneCode);
}

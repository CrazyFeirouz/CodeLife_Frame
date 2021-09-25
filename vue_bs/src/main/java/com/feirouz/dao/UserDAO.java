package com.feirouz.dao;

import com.feirouz.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: 测试用户
 * @author: Feirouz
 * @date: 2021-09-25 1:00
 */
public interface UserDAO {
    // 查询所有
    List<User> findAll();

    // 保存用户
    void save(User user);

    // 根据id删除用户
    void delete(String id);

    // 根据id查询用户信息
    User findUser(String id);

    // 根据id修改用户信息
    void update(User user);

    // 根据姓名或者电话进行模糊搜索
    List<User> findNameOrPhoneCode(@Param("name") String name, @Param("phoneCode") String phoneCode);
}

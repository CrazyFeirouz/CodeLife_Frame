package com.feirouz.service;

import com.feirouz.dao.UserDAO;
import com.feirouz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @description:
 * @author: Feirouz
 * @date: 2021-09-25 13:59
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)  // 如果当前环境有事务，就加入到当前事务；如果没有事务，就以非事务的方式执行。
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }

    @Override
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)  // 如果当前环境有事务，就加入到当前事务；如果没有事务，就以非事务的方式执行。
    public User findUser(String id) {
        return userDAO.findUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.update(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)  // 如果当前环境有事务，就加入到当前事务；如果没有事务，就以非事务的方式执行。
    public List<User> findNameOrPhoneCode(String name, String phoneCode) {
        return userDAO.findNameOrPhoneCode(name, phoneCode);
    }
}

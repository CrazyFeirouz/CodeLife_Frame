package com.feirouz.sbtest.controller;

import com.feirouz.sbtest.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 用来测试的User控制器
 * @author: Feirouz
 * @date: 2021-09-12 23:22
 */

@RestController
@RequestMapping("user")
public class UserController {
    // 删除数据
    @CrossOrigin    // 用来解决跨域问题
    @DeleteMapping("delete")
    public Map<String, Object> delete(String id) {
        Map<String, Object> map = new HashMap<>();
        System.out.println("id = " + id);
        map.put("success", true);
        return map;
    }

    // 保存数据
    @CrossOrigin
    @PostMapping("save")
    public Map<String, Object> save(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        System.out.println("user = " + user);
        map.put("success", true);
        return map;
    }

    // 展示索引
    @CrossOrigin
    @GetMapping("findAll")
    public List<User> findAll(String name) {
        System.out.println("name: " + name);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Feirouz", "123"));
        users.add(new User(2, "Peter", "456"));
        users.add(new User(3, "ZeroNIne", "789"));
        return users;
    }
}

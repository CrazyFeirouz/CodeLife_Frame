package com.feirouz.controller;

import com.alibaba.druid.util.StringUtils;
import com.feirouz.entity.User;
import com.feirouz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Feirouz
 * @date: 2021-09-25 14:04
 */

@RestController
@CrossOrigin                // 内部所有方法全部跨域
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    // 查询所有方法
    @GetMapping("findAll")
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    // 保存用户方法
    @PostMapping("save")
    public Map<String, Object> save(@RequestBody User user) {
        // 判断是否存在id ，存在->修改 ； 不存在->添加
        HashMap<String, Object> map = new HashMap<>();
        if (StringUtils.isEmpty(user.getId())) {    // 修改
            try {
                userService.save(user);
                map.put("success", true);
                map.put("msg","用户保存成功");
            }catch (Exception e) {
                map.put("success", false);
                map.put("msg","用户保存失败");
                e.printStackTrace();
            }
        }else {                                     // 添加
            try {
                userService.updateUser(user);
                map.put("success", true);
                map.put("msg","用户修改成功");
            }catch (Exception e) {
                map.put("success", false);
                map.put("msg","用户修改失败");
                e.printStackTrace();
            }
        }


        return map;
    }

    // 删除用户方法
    @GetMapping("delete")
    public Map<String, Object> delete(String id) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("success", true);
            map.put("msg","用户删除成功");
        }catch (Exception e) {
            map.put("success", false);
            map.put("msg","用户删除失败，请稍后再试！");
            e.printStackTrace();
        }
        return map;
    }

    // 查询用户方法
    @GetMapping("findUser")
    public User findUser(String id) {
        return userService.findUser(id);
    }

    // 模糊搜索方法
    @GetMapping("findLike")
    public List<User> findNameOrCode(String name, String phoneCode) {
        List<User> users = null;
        try {
            users = userService.findNameOrPhoneCode(name, phoneCode);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

}

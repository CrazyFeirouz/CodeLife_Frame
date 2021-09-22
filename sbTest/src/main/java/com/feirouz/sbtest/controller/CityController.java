package com.feirouz.sbtest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 联合selectWeather实现查询天气功能
 * @author: Feirouz
 * @date: 2021-09-22 18:53
 */

@RestController
@RequestMapping("city")
public class CityController {

    @GetMapping("find")
    @CrossOrigin
    public Map<String, String> findWeatherByCity(String name) {
        Map<String, String> map = new HashMap<>();

        String msg = getWeathers(name);
        map.put("msg", msg);

        return map;
    }

    // 返回对应城市天气
    public String getWeathers(String name) {
        Map<String, String> weathers = new HashMap<>();
        weathers.put("北京", "晴转多云，空气清新！");
        weathers.put("上海", "多云转晴，空气质量不错！");
        weathers.put("广州", "中到暴雨，空气也很好");
        weathers.put("深圳", "局部地区大于，空气也算不错");
        return weathers.get(name);
    }
}

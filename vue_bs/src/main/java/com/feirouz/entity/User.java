package com.feirouz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @description: 用户
 * @author: Feirouz
 * @date: 2021-09-25 0:27
 */

@Data               // @Setter、@Getter、@RequiredArgsConstructor、@ToString、@EqualsAndHashCode
@AllArgsConstructor // 使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor
@ToString
@Accessors(chain = true)     // 生成setter方法返回this（也就是返回的是对象），代替了默认的返回void
public class User {
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private String phoneCode;
}

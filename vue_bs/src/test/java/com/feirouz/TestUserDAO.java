package com.feirouz;

import com.feirouz.dao.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: Feirouz
 * @date: 2021-09-25 1:07
 */

@SpringBootTest(classes = VueApplication.class)
public class TestUserDAO {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindAll() {
        // arraylist.forEach(Consumer<E> action)
        userDAO.findAll().forEach(user -> System.out.println("user = " + user));
    }
}

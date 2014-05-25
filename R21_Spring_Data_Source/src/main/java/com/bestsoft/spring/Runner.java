package com.bestsoft.spring;

import com.bestsoft.spring.dao.JdbCircleDao;
import com.bestsoft.spring.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        JdbCircleDao dao = context
                .getBean("jdbCircleDao", JdbCircleDao.class);

        Circle circle = dao.getCircle(1);
        System.out.println(circle.getName());
    }
}

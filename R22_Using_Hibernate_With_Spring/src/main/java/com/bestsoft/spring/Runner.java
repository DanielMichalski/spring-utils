package com.bestsoft.spring;

import com.bestsoft.spring.dao.HibernateDaoImpl;
import com.bestsoft.spring.dao.JdbCircleDao;
import com.bestsoft.spring.dao.SimpleJDBCDao;
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

        SimpleJDBCDao simpleDao = context
                .getBean("simpleJDBCDao", SimpleJDBCDao.class);

        HibernateDaoImpl hibernateDao =
                context.getBean("hibernateDaoImpl", HibernateDaoImpl.class);

        System.out.println(dao.getCircleCount());
        System.out.println(dao.getCircleName(1));
        System.out.println(dao.getCircleForId(1));
        System.out.println(dao.getAllCircles());

        System.out.println(simpleDao.getCircleCount());

        System.out.println(hibernateDao.getCircleCount());

//        dao.insertCircle(new Circle(3, "Third circle"));
//        dao.insertCircleNamedParameter(new Circle(4, "Fourth circle"));

//        dao.createTriangleTable();


    }
}

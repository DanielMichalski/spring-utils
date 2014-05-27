package com.bestsoft.spring.dao;

import com.bestsoft.spring.model.Circle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Daniel
 */
@Repository
public class HibernateDaoImpl {

    @Autowired
    private SessionFactory sessionFactory;

    public Object getCircleCount() {
        Session session = sessionFactory.openSession();
        List<Circle> result = (List<Circle>) session.createQuery("from circle").list();
        return result.size();
    }
}

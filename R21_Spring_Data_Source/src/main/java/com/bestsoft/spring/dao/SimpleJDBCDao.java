package com.bestsoft.spring.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 * Author: Daniel
 */
public class SimpleJDBCDao extends SimpleJdbcDaoSupport {
    public int getCircleCount() {
        String sql = "SELECT COUNT(*) FROM circle";
        return getJdbcTemplate().queryForObject(sql, Integer.class);
    }
}

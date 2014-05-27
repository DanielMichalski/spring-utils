package com.bestsoft.spring.dao;

import com.bestsoft.spring.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Author: Daniel
 */
@Repository
public class JdbCircleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public int getCircleCount() {
        String sql = "SELECT COUNT(*) FROM circle";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public String getCircleName(int circleId) {
        String sql = "SELECT name FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sql, String.class, circleId);
    }

    public Circle getCircleForId(int circleId) {
        String sql = "SELECT * FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new CircleMapper(), circleId);
    }

    public List<Circle> getAllCircles() {
        String sql = "SELECT * FROM circle";
        return jdbcTemplate.query(sql, new CircleMapper());
    }

    public void insertCircle(Circle circle) {
        String sql = "INSERT INTO circle (id, name) VALUES (?, ?)";
        int id = circle.getId();
        String name = circle.getName();
        jdbcTemplate.update(sql, id, name);
    }

    public void insertCircleNamedParameter(Circle circle) {
        String sql = "INSERT INTO circle (id, name) VALUES (:id, :name)";
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("id", circle.getId())
                .addValue("name", circle.getName());
        namedParameterJdbcTemplate.update(sql, parameters);

    }

    public void createTriangleTable() {
        String sql = "CREATE TABLE triangle (id INTEGER, name VARCHAR(50))";
        jdbcTemplate.execute(sql);
    }

    private static final class CircleMapper implements RowMapper<Circle> {
        @Override
        public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            return new Circle(id, name);
        }
    }
}

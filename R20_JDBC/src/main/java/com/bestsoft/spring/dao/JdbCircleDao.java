package com.bestsoft.spring.dao;

import model.Circle;

import java.sql.*;

/**
 * Author: Daniel
 */
public class JdbCircleDao {
    public Circle getCircle(int circleId) {
        Connection conn = null;

        try {
            String driver = "org.apache.derby.jdbc.ClientDriver";
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle WHERE id = ?");
            ps.setInt(1, circleId);

            Circle circle = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                circle = new Circle(circleId, rs.getString("name"));
            }

            rs.close();
            ps.close();

            return circle;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

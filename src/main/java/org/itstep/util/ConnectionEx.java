package org.itstep.util;

import java.sql.*;

public class ConnectionEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/students?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, "root", "root");
        connection.setAutoCommit(false);//отключить автовыполнение
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString(1) +
//                    " " + resultSet.getNString("name") +
//                    " " + resultSet.getNString("phone") +
//                    " " + resultSet.getInt(3));
//        }

//        resultSet.next();
//        resultSet.next();
//        resultSet.next();
//        System.out.println(resultSet.getString("name"));
//        //resultSet.first();
//        System.out.println(resultSet.getString("name"));
//        resultSet.updateInt("age",30);
//        //resultSet.rowUpdated();
//        resultSet.updateRow();
//        resultSet.moveToInsertRow();
//        resultSet.updateString("name", "Имя2");
//        resultSet.updateString("phone", "22222");
//        resultSet.updateInt("age", 10);
//        //resultSet.updateRow();
//        resultSet.insertRow();
//        resultSet.first();
//        resultSet.deleteRow();

//        resultSet.last();
//        resultSet.deleteRow();
//
        connection.commit();
        //connection.rollback();
    }
}

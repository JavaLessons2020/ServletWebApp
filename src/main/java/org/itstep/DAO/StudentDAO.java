package org.itstep.DAO;

import org.itstep.model.Student;
import org.itstep.util.ConnectionJDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    String insert = "insert into student(`name`,`age`,`phone`) values (?, ?, ?)";

    public void add(Student student) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = ConnectionJDBC.getConnection(insert);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getAge());
        preparedStatement.setString(3, student.getPhone());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }
}

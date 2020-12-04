package org.itstep.DAO;

import org.itstep.model.Student;
import org.itstep.util.ConnectionJDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public final String INSERT = "insert into student(`name`,`age`,`phone`) values (?, ?, ?)";
public  final String GET_ALL = "select * from student";


    public void add(Student student) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = ConnectionJDBC.getConnection(INSERT);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getAge());
        preparedStatement.setString(3, student.getPhone());
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }

    public List<Student> getAllStudents() throws SQLException, ClassNotFoundException {

        List<Student> students = new ArrayList<>();
        PreparedStatement preparedStatement = ConnectionJDBC.getConnection(GET_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getLong("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setAge(resultSet.getInt("age"));
            students.add(student);
            System.out.println(student);
        }

        return students;
    }
}

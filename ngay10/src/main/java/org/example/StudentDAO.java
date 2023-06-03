package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private Database database;
    public StudentDAO() {
        this.database = new Database();
    }
    public List<Student> findAll() {
        List<Student> listStudent = new ArrayList<>();
        String sql = "SELECT * FROM student";
        try {
            Statement statement = database.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Student student = new Student(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("phone"));
                listStudent.add(student);
            }
            for(Student student : listStudent) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listStudent;
    }
//    public Student findById(int id) {
//
//    }
//    public boolean insert(Student student) {
//
//    }
//
//    public boolean update(Student student, int id) {
//
//    }
//
//    public boolean delete(int id) {
//
//    }
}

package org.example;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> listStudent = studentDAO.findAll();
        for (Student student : listStudent) {
            System.out.println(student);
        }

        for (int i = 0; i< 1000; i++) {
            String s = new String("" + i);
        }

        int i = 10;
        int newInt = i >10 ? 100 : 0;

        if (i> 10) {
            newInt = 100;
        } else {
            newInt = 0;
        }
    //database access object => DAO
    }
}
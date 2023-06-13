package com.example.wb1.DateBase;

import java.sql.*;
import java.time.LocalDate;

public class SqliteMain {
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/TEMP/db/MainBaseMse.db");
        } catch (SQLException e) {
            System.out.println("Проблемы с подключением к базе данных");
            e.printStackTrace();
        }
    }
    public int getCountWB(String idWb){
        int count = 0;
        try {
            PreparedStatement pstmt;
            pstmt = connection.prepareStatement("SELECT count(*) from main where IDWB= '" + idWb+ "'");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next())
                count = resultSet.getInt(1);
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return count;
        }
        return count;
    }

    public boolean InsertWb(String name,
                                String price,
                                String idWb) {

        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO ReportDirection VALUES (?,?,?,?)")) {
            statement.setString(2, name);
            statement.setString(3, price);
            statement.setString(4, idWb);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +
                    " База занята");
            try {
                Thread.sleep(1000*3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }


}

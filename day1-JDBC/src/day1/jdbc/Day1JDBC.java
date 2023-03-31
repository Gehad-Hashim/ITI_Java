/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AL-FAJR
 */
public class Day1JDBC {
    /**
     * @param args the command line arguments
     */
    public Day1JDBC(){
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty", "gehad", "Qaz123zaq");
        Statement stmt=con.createStatement();
        String queryString=new String("select * from student");
        ResultSet rs=stmt.executeQuery(queryString);
        while(rs.next()){
             System.out.println("id:"+rs.getString(1)+" name:"+rs.getString(2));
        }
        stmt.close();
        con.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("hello DB"); 
        new Day1JDBC();
    }
    
    
}

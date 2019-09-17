/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoyalPharma;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DbConnect {
     public static Connection getConnection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=
                DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
            System.out.println("DB CONNECT***************************");
        return conn;
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            return null;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    
     }
}

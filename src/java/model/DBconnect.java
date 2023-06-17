/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author compu zone
 */
//public class DBconnect 
//{
//    private PreparedStatement saveStmt;
//    
//     public void saveStock(TheStock S) throws SQLException{
//         // ---Connection start----
//        String host = "jdbc:derby://localhost:1527/guitarshop";
//        String uName = "StoreAdmin";
//        String uPass = "123";
//        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/guitarshop,StoreAdmin,123");
//        
//        saveStmt = conn.prepareStatement("INSERT INTO StoreAdmin (PRODUCTID,PRODUCTNMAE,DESCRIPTION,CATEGORY,PRICE)"+"VALUES(?,?,?,?,?)");
//        saveStmt.setString(1,S.getPname());
//        saveStmt.setString(2,S.getIDp());
//        saveStmt.setString(3,S.getCategory());
//        saveStmt.setString(4,S.getDescripton());
//        saveStmt.setString(5,S.getPrice());
//        saveStmt.executeUpdate();
//        // ---Connection end----
//     }
//}

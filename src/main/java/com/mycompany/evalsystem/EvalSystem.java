/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evalsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author avery
 */
public class EvalSystem {
    
    public static Connection conn() {
        try {
            String url = "jdbc:ucanaccess://src/main/resources/database/Eval_Database.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

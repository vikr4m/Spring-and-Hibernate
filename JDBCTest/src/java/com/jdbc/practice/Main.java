/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;
import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
        try{
            Connection c = ConnectionProvider.getConnection();
            
            String q = "insert into images(pic) values (?)";
            PreparedStatement pstmt = c.prepareStatement(q);
            
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            
            File file = jfc.getSelectedFile();
            
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1, fis,fis.available());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Insertion successful..");
            c.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

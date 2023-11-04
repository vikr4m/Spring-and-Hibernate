/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

/**
 *
 * @author vikram
 */
public class updatejdbc {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionProvider.getConnection();
            
            String q = "update table1 set tname=?, tcity=? where tid=?";
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new name: ");
            String name = br.readLine();
            System.out.println("Enter new city:");
            String city = br.readLine();
            
            System.out.println("Enter the id:");
            int id= Integer.parseInt(br.readLine());
            
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            
            pstmt.executeUpdate();
            
            System.out.println("Updation Successful..");
            
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

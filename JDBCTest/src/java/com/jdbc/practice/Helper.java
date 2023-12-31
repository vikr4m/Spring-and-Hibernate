/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author vikram
 */
public class Helper {
    public static ImageIcon getImageIconById(int id, Connection con){
        ImageIcon icon = null;
        
        try {
            String q = "select pic from images where id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, id);
            ResultSet set = pstmt.executeQuery();
            
            if(set.next()){
                Blob b = set.getBlob("pic");
                InputStream is = b.getBinaryStream();
                
                Image image = ImageIO.read(is);
                
                icon = new ImageIcon(image);
            }
        } catch (Exception e) {
            
        }
        
        return icon;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.registration;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletContext;
import java.sql.*;
import java.sql.Connection;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author vikram
 */
@MultipartConfig
public class Register extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String name = request.getParameter("username");
            String email = request.getParameter("useremail");
            String password = request.getParameter("userpassword");
            Part part = request.getPart("image");
            String filename = part.getSubmittedFileName();
            //out.println(filename);
            
            //db connection
            try{
                Thread.sleep(1000);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
                
                //query
                String q = "insert into user(name,email,password,imageName) values(?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(q);
                pstmt.setString(1, name);
                pstmt.setString(2,email);
                pstmt.setString(3,password);
                pstmt.setString(4, filename);
                
                pstmt.executeUpdate();
                
                //upload file
                InputStream is = part.getInputStream();
                byte[] data = new byte[is.available()];
                
                is.read(data);
                ServletContext context = request.getServletContext();
                String path= context.getRealPath("/")+"img"+File.separator+filename;
                
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(data);
                fos.close();
                
                
                out.println("Okay");
            }
            catch (Exception e){
                e.printStackTrace();
                out.println("Error");
            }
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

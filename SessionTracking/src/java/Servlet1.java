/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author vikram
 */
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String name = request.getParameter("name");
            
            out.println("<h1>Hello "+name+"</h1>");
            
            //IF USING HIDDEN FORM FIELDS
            out.println(""
                    + "<form action='Servlet2'>"
                    + "<input type='hidden' name='name' value='"+name+"'/>"
                    + "<button>Go to second servlet</button>"
                    + ""
                    + ""
                    + "</form>");
            
            //IF USING URL REWRITING
            //out.println("<a href='Servlet2?name="+name+"'>Go to second servlet</a>");
            
            //IF USING COOKIES
////            if(name == ""){
////                out.println("<h2>No name entered, go back to home</h2>");
////                out.println("<a href='index.html'>Home</a>");
////            }
////            else{
////            out.println("<h1>Hello, "+name+" welcome to session testing...</h1>");
////            out.println("<h2><a href='Servlet2'>Go to servlet2</a></h2>");
//            
//            
//            
//            //creating cookie
//            Cookie c = new Cookie("name",name);
//            response.addCookie(c);
//            }
            out.println("</body>");
            out.println("</html>");
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

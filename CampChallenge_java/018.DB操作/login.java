/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author user
 */
public class login extends HttpServlet {
    Connection c=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
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
           
         
             try{
                 request.setCharacterEncoding("UTF-8");
                 String id=request.getParameter("user");
                 int pass=Integer.parseInt(request.getParameter("pass"));
                 
                 
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_control","muro","pass");
                 ps = c.prepareStatement("select * from user where id=? and pass=? ");
                 ps.setString(1,id);
                 ps.setInt(2, pass);
                 rs = ps.executeQuery(); 
                  
                 if(rs.next()){
                 out.print("ようこそ"+rs.getString("name")+"さん");
                     response.sendRedirect("http://localhost:8080/zaiko/product_input.jsp");
                 }else{
                     out.print("ログインIDまたはパスワードが違います");
                     response.sendRedirect("http://localhost:8080/zaiko/login_input.jsp");
                 }
                 
                 c.close();
                 ps.close(); 
                 rs.close();
               
            }catch(SQLException e_sql){
                out.print("接続時にエラーが起こりました"+e_sql.toString());
            }catch(Exception e){
                out.print("エラーが起こりました"+e.toString());
            }finally{
                if(c != null){
                    try{
                        c.close();
                    }catch(Exception e_con){
                        System.out.print(e_con.getMessage());
                    }
                }
            }
        
    
            /* TODO output your page here. You may use following sample code. */
           
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

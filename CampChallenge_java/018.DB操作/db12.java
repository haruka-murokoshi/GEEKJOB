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
public class db12 extends HttpServlet {
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
                
                //変数へ格納
                
                String name =request.getParameter("名前");
                int age =Integer.parseInt(request.getParameter("年齢"));
                String birth =request.getParameter("生年月日");
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                c =DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge__db","MURO","pass");
                ps =c.prepareStatement("select * from profiles where name=? or age=? or birthday=?;");
                
                 ps.setString(1,name);
                 ps.setInt(2, age);
                 ps.setString(3, birth);
                
                
                 ps = c.prepareStatement("select * from profiles;");
                 rs =ps.executeQuery();
                 
                  while(rs.next()){
                 out.print("ID："+rs.getInt("profilesID")+"<br>");
                 out.print("名前："+rs.getString("name")+"<br>");
                 out.print("電話番号："+rs.getString("tel")+"<br>");
                 out.print("年齢："+rs.getInt("age")+"歳"+"<br>");
                 out.print("誕生日："+rs.getString("birthday")+"<br>");
                     
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db12</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet db12 at " + request.getContextPath() + "</h1>");
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

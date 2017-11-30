/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class math1 extends HttpServlet {

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
            
            Date start =new Date(29,10,29,18,30,00);
            
            
            SimpleDateFormat sdf=new SimpleDateFormat("平成yy年MM月dd日HH時mm分ss秒");
             out.println(sdf.format(start.getTime())+"開始！！");
            
             int i= 25;
             int n= 8 ;

            out.println( i + "と" + n + "では");
            //max 大きいほう
            out.println(  Math.max(i, n) + "の方が大きい");
            //min小さいほう
            out.println(  Math.min(i, n) + "の方が小さい。");
            
            //pow 累乗
           
            double a=4;
            double b=3;
            out.println( a +"の"+ b +"乗は"+Math.pow( a , b )+"です。");
                    
            //sqrt 平方根
            out.println(i+"の平方根は"+(Math.sqrt(i))+"です。");
            
            
            Date end =new Date(29,10,30,11,02,00);
            
            
           
             out.println(sdf.format(end.getTime())+"終了");
            
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

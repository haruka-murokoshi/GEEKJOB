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


/**
 *
 * @author user
 */
public class blackjack extends HttpServlet {

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
            //インスタンス
             Dealer dealer =new Dealer();
             User user =new User();
            //myCardsに2枚ずつセット
            dealer.setCard(dealer.Deal());
            user.setCard(dealer.Deal());
            //中身確認
            out.println("ディーラーの手札"+dealer.myCards);
            out.println("ユーザーの手札"+user.myCards);
            //myCardsの中身を計算
           
            out.println("ディーラーの合計"+dealer.open());
            out.println("ユーザーの合計"+user.open());
            
            //もう一枚引くかどうか
           if(dealer.checkSum()){
               dealer.setCard(dealer.Hit());
               out.println("ディーラーはカードを追加しました");
           }else{
               out.println("ディーラーはカードを追加しませんでした");
           }
              
           if(user.checkSum()){
               dealer.setCard(dealer.Hit());
               out.println("ユーザーはカードを追加しました");
           }else{
               out.println("ユーザーはカードを追加しませんでした");
           }
            
            
           //もう一枚引いたあとの合計
           out.println("ディーラーの合計"+dealer.open());
           out.println("ユーザーの合計"+user.open());
           
           //勝敗の判定
           
           if(dealer.open()==user.open()||(dealer.open()>= 22 &&user.open()>= 22 )){
               out.print("引き分け");
           }else if(dealer.open()>= 22){
               out.print("ユーザーの勝ち");
           }else if(user.open()>=22)  {
               out.print("ディーラーの勝ち");
           }else if(dealer.open()==21){
               out.print("ディーラーの勝ち");
           }else if(user.open()==21){
               out.print("ユーザーの勝ち");
           }else if(user.open()>dealer.open()){
               out.print("ユーザーの勝ち");
           }else {
               out.print("ディーラーの勝ち");
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

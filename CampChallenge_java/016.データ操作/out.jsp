<%-- 
    Document   : out
    Created on : 2017/11/30, 19:26:40
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String total1 = request.getParameter("total");
    String count1= request.getParameter("count");
    //int型に変換
    int total = Integer.parseInt(total1);
    int count = Integer.parseInt(count1);
   
     out.println("総額は"+total+"円</br>");
     out.println("個数は"+count+"個</br></br>");
     
     out.print("種類は");
     
     String type1=request.getParameter("type");
     //int型に変換
    int type=Integer.parseInt(type1);
     //種類の表示処理
    if(type==1){
        out.print("雑貨</br>");
    } else if(type==2){
            out.print("生鮮食品</br>");
            }else if(type==3){
            out.print("その他</br>");
            }else{
            out.print("1～3の間で入力してください。</br>");
            }
    

     //総額から1個あたりの値段を計算
     int unit=total/count;
     out.print("1個あたりの値段は「"+unit+"円」です。</br>");
     

     //  3000円以上で、4%  5000円以上で、5%
     if(total>=5000){
         out.print("ポイントは"+total*0.05+"ポイントつきます。");
     }else if(total>=3000){
         out.print("ポイントは"+total*0.03+"ポイントつきます");
     }else{
        out.print("ポイント付与はありません。");
     }




    %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

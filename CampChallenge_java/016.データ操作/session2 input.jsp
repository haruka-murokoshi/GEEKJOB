<%-- 
    Document   : session2 input
    Created on : 2017/12/04, 10:36:06
    Author     : user
--%>


<%
     request.setCharacterEncoding("UTF-8");
     //セッション取得
HttpSession hs=request.getSession();
     //セッションへデータ書き込み（情報取り出し）
hs.setAttribute("name1",request.getParameter("name"));
hs.setAttribute("rdoSex1",request.getParameter("rdoSex"));
hs.setAttribute("hobby1",request.getParameter("hobby"));
    //String変数へ入れる
    
String myname= null ;
        myname =( String ) hs .getAttribute("name1");
String myrdoSex =null;
myrdoSex =( String ) hs .getAttribute("rdoSex1");
String myhobby =null;
myhobby = ( String ) hs .getAttribute("hobby1");

String woman ="";
String man ="";

if(myrdoSex !=null){
    if( myrdoSex =="男"){man="checked";}
    if( myrdoSex =="女"){woman="checked";}
}

    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
         <form action="session2 input.jsp" method="post">
        
             氏名 <input type="text" name="name" value=<% if( myname != null){out.print( myname );}else{out.print("");}%>> <br>
        
        <div>性別<br>
        
            <input type="radio" name="rdoSex" value="男"<%=man%>>男
            <input type="radio" name="rdoSex" value="女"<%=woman%>>女</div>
        
        <div>趣味<br>
            <textarea name="hobby"  rows="5" cols="50"><% if( myhobby != null){out.print( myhobby );}else{out.print(" ");}%></textarea></div>
        
        <input type="submit" name="btnSubmit">
            
        </form>
    


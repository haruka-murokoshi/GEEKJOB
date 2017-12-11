<%-- 
    Document   : newjspｄｂ8-2
    Created on : 2017/12/11, 11:21:54
    Author     : user
--%>

<%@page import="java.sql.*"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="./db8" method="post">
            検索したい文字を入力 <input type="text" name="検索">
    
             <input type="submit" name="btnSubmit">
    
</form>
        
        <h1>Hello World!</h1>
    </body>
</html>

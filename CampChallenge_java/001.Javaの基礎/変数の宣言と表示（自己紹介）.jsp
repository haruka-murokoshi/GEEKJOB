<%-- 
    Document   : 変数の宣言と表示（自己紹介）
    Created on : 2017/10/27, 14:30:46
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
     int age=23;
     String name="室越晴香";
     out.print("名前" );
     out.print(name);
     out.print("年齢");
     out.print(age);
     
     String hobby=("趣味　音楽");
     out.print(hobby);


    %>
    </body>
</html>

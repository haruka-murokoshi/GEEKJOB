<%-- 
    Document   : 連想配列の作成
    Created on : 2017/10/31, 13:46:37
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
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String, String>user1= new HashMap<String, String>();
            user1.put("1", "AAA");
            user1.put("hello", "world");
            user1.put("soeda", "33");
            user1.put("20", "20");
            
            %>
    </body>
</html>

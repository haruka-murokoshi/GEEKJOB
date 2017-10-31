<%-- 
    Document   : 配列の変更1
    Created on : 2017/10/31, 13:11:04
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
           String[]datas={"10","100","soeda","hayashi","-20","118","END"};
          datas[2]="33";
          
            

           %>
    </body>
</html>

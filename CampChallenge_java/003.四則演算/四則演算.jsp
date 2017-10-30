<%-- 
    Document   : 四則演算
    Created on : 2017/10/30, 12:00:21
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
           int num=27;
           final int TASU=2;
           
           int tasu=num+TASU;
           int hiku=num-TASU;
           int waru=num/TASU;
           int kake=num*TASU;
           int zyou=num%TASU;
           
           out.print(tasu);
           out.print(hiku);
           out.print(waru);
           out.print(kake);
           out.print(zyou);

            %>
            
    </body>
</html>

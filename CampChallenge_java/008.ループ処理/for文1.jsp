<%-- 
    Document   : for文1
    Created on : 2017/10/31, 14:32:19
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
            long a=1;
            for(int i=0;i<20;i++){
        
               a=a*8;   
            }
             out.print(a);
            %>
    </body>
</html>

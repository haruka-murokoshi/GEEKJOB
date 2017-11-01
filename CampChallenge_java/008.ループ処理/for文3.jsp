<%-- 
    Document   : for文3
    Created on : 2017/11/01, 10:52:01
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
            long tasu =0;
            long tasu2 =0;
            for(int i =0 ; i <100 ; i++ ){
                tasu2 =++ tasu2;
            tasu = tasu + tasu2;
            
        }
           
            %>
    </body>
</html>

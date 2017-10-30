<%-- 
    Document   : switch文1
    Created on : 2017/10/30, 16:07:15
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
            int num=2;
            switch(num){
                case 1:out.print("one");
                        break;
                case 2:out.print("two");
                        break;
                default:out.print("想定外");
                        break;
                  }
            %>
            
    </body>
</html>

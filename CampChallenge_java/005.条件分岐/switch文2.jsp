<%-- 
    Document   : switch文2
    Created on : 2017/10/30, 16:28:09
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
          char num='　';
          switch(num){
              case 'あ':out.print("日本語");
                      break;
              case 'A':out.print("英語");
                      break;
          }
        
        
        
        
                %>
                
    </body>
</html>

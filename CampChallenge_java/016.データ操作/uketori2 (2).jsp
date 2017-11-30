<%-- 
    Document   : uketori2
    Created on : 2017/11/30, 14:49:21
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
            /* TODO output your page here. You may use following sample code. */
            out.println(request.getParameter("txtName"));
            out.println(request.getParameter("rdoMan"));
            out.println(request.getParameter("rdoWoman"));
            out.println(request.getParameter("hobby"));  
            %>
<html>
    <head>
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    </body>
</html>

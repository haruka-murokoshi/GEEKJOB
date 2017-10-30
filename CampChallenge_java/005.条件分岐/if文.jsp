<%-- 
    Document   : if文
    Created on : 2017/10/30, 14:53:51
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
            if(num==1){out.print("1です！");
            }
            else if(num==2){out.print("プログラミングキャンプ！");}
            else{out.print("その他です！");}
            
            %>
    </body>
</html>

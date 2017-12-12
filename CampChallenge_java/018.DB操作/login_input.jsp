<%-- 
    Document   : login_input
    Created on : 2017/12/11, 18:26:03
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン</title>
    </head>
    <body>
        
           <form action="./login" method="post">
               <div>ログインします。</div>
               <div>下記へ入力してください。</div>
               
               
               <div>【ID】<input type="text" name="user"></div>
               <div>【パスワード】<input  type="password" name="pass"></div>
               
    
             <input type="submit" name="btnSubmit" value="ログイン">
    
</form>
        <h1>Hello World!</h1>
    </body>
</html>

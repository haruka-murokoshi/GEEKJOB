<%-- 
    Document   : db11-2
    Created on : 2017/12/11, 14:42:52
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
         <form action="./db11" method="post">
               <div>データを更新します。</div>
               <div>下記へ入力してください。</div>
               
               
               <div>【更新したいprofilesID】<input type="text" name="ID"></div>
               <div>更新内容</div>
               <div>【名前】<input  type="text" name="名前"></div>
               <div>【電話番号】<input type="text" name="電話"></div>
               <div>【年齢】<input type="text" name="年齢"></div>
               <div>【生年月日】<input type="text" name="生年月日"></div>
    
             <input type="submit" name="btnSubmit">
    
</form>
        <h1>Hello World!</h1>
    </body>
</html>

<%-- 
    Document   : ｄｂ9-2
    Created on : 2017/12/11, 13:33:35
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
           <form action="./__9" method="post">
               <div>データを追加します。</div>
               <div>下記へ入力してください。</div>
               
               
               <div>【profilesID】<input type="text" name="ID"></div>
               <div>【名前】<input  type="text" name="名前"></div>
               <div>【電話番号】<input type="text" name="電話"></div>
               <div>【年齢】<input type="text" name="年齢"></div>
               <div>【生年月日】<input type="text" name="生年月日"></div>
    
             <input type="submit" name="btnSubmit">
    
</form>
        <h1>Hello World!</h1>
    </body>
</html>

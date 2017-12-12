<%-- 
    Document   : product_input
    Created on : 2017/12/11, 19:10:13
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品</title>
    </head>
    <body>
        <form action="./product" method="post">
            <div>商品情報を入力してください。</div>
            
            <div>商品コード<br><input type="number" name="商品コード" min="1"></div>
            
            <div>商品名<br><input type="text" name="商品名"></div>
            
            <div>値段<br><input type="number" name="値段"></div>
            
            <div>商品種別(当てはまる数字を入力してください。)</div>
            <div>1.食料品　2.衣類　3.医療雑貨　4.日用品</div>
            <div><input type="number" name="種別" min="1" max="4" ></div>
            
            　 <input type="submit" name="btnSubmit" value="送信">
             
        </form>
        <h1>Hello World!</h1>
    </body>
</html>

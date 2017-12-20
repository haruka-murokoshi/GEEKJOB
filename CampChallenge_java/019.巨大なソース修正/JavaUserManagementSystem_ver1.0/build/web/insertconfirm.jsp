
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs=request.getSession(); 
    //セッションからデータ読み出し
    UserDataBeans udb =(UserDataBeans)session.getAttribute("udbase");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        <%--名前～コメントのどれも空でないとき登録確認--%>
        <%
        if(!udb.getName().equals("") && !udb.getYear().equals("") && !udb.getMonth().equals("") &&
           !udb.getDay().equals("") && !udb.getType().equals("") && !udb.getTell().equals("") && !udb.getComment().equals("")){
            %>
    
        <h1>登録確認</h1>
        
        <%--insertconfilm.jspでサーブレットに格納してある。--%>
      
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth() +"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
             <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>"><%--非表示データ送信--%>
            <input type="submit" name="yes" value="はい">
        </form>
    <%} else {
      if(request.getParameter("name").equals("")){
             out.print("名前が入力されていません。"+"<br>");
      }
      if(request.getParameter("year").equals("")){
             out.print("生まれ年が入力されていません。"+"<br>");
      }
      if(request.getParameter("month").equals("")){
             out.print("生まれ月が入力されていません。"+"<br>");
      }
      if(request.getParameter("day").equals("")){
             out.print("生まれた日が入力されていません。"+"<br>");
      }
      if(request.getParameter("type")==null){
             out.print("種別が選択されていません。"+"<br>");
      }
      if(request.getParameter("tell").equals("")){
             out.print("電話番号が入力されていません。"+"<br>");
      }
      if(request.getParameter("comment").equals("")){
             out.print("自己紹介が入力されていません。"+"<br>");
      }}%>
    
        <form action="insert" method="POST">
            
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
         <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>

<%-- 
    Document   : soinnsuu
    Created on : 2017/12/01, 11:53:13
    Author     : user
--%>


<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="javax.validation.OverridesAttribute.List"%>

<%
    request.setCharacterEncoding("UTF-8");
    
    String number1 = request.getParameter("number");
    int number=Integer.parseInt(number1);
 
 int kazu = number;

 out.print(number + " =入力値<br>");
 for (int i = 2; (i < number) && (1 < kazu); i++) {
 if (kazu % i == 0) {
 if (i<10) {
 out.print("1桁の素因数"+i+"<br>");
 }else{
     out.print("余った値"+i+"<br>");
 }
 
 kazu /= i;
 i--;
 }
 }

 if (kazu == number) {
  out.print("素数");
 }
 

 
 


 
    


    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

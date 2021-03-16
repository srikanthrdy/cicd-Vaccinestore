<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.mid
{
  text-align: center;
}

</style>
</head>
<body style="background-color:#ffae33">
<h1 class="mid">VACCINES IN AMERICA</h1>
<%  

ArrayList<String> list = (ArrayList<String>)request.getAttribute("AmericanVaccines");		


for(String name : list) {
   %><ul type="square"><li><%
    out.println(name);}
  %></li></ul> 
</body>
</html>
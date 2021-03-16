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
table, th, td {
   padding: 100px 132px;
</style>
</head>
<body style="background-color:#ffae33">
<h1 class="mid">VACCINES IN INDIA</h1>
  <%  

	ArrayList<String> list = (ArrayList<String>)request.getAttribute("IndianVaccines");		


for(String name : list) {
  %><table><tr><th>
    out.println(name);}
  %></th></tr></table>
</body>
</html>

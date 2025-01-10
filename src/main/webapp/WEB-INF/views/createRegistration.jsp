
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<h2>create registration page
</h2>
<form action="saveRegistration" method="post">
Name:<input type="text" name="name">
City:<input type="text" name="city">
Email:<input type="text" name="email">
Mobile:<input type="text" name="mobile">
<input type="submit" name="save">
</form>

<%
if(request.getAttribute("msg") !=null){
 out.println(request.getAttribute("msg"));
}
%>
</body>
</html>
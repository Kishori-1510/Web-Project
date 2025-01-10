
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>update</title>
</head>
<body>
<h2>update registration page
</h2>
<form action="update" method="post">

Email:<input type="text" name="email" value="<%=request.getAttribute("email")%>"/>
Mobile:<input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>" />
<input type="submit" name="update">
</form>


</body>
</html>
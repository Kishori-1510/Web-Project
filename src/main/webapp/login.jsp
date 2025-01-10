<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Registration MVC</title>
</head>
<h1>Login Page</h1>
<form action="verifyRegistration" method="post">
Enter Email: <input type="text" name="email">
Enter Password:<input type="password" name="password">
<input type="submit" value="Login">

</form>
<%
if(request.getAttribute("error") !=null){
 out.println(request.getAttribute("error"));
}
%>
<body>

</body>
</html>
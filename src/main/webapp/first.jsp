<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>MVC example</title>
</head>
<body>
<form action="mvcExample" method="post">

  <table>
   <tr>
   <td>
   Enter firstname:<input type="text" name="name">
   </td>
    </tr>
    <tr>
    <td>
    Enter lastName:<input type="text" name="lastName">
    </td>
     </tr>
     <tr>

   </table>
   <br>
 Number 1: <input type="text" name="num1">
 Number 2: <input type="text" name="num2">
 <input type="submit" value="ADDITION">


</form>

<%
if(request.getAttribute("res") != null){
out.println(request.getAttribute("res"));
out.println(request.getAttribute("Name"));
}
%>
</body>
</html>
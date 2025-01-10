<%@ page import="java.util.Date"%>
<%@ page import="java.util.Scanner"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Inter Servelet Communication</title>
    <h1>User Registration</h1>
    <form action="first" method="post">
       name<input type="text" name="name">
       <input type="submit" value="click">
    </form>

<br></br>
    <%!

    public int i =150;
    public int test()
   {
    return 100;
    }
    %>


    <%=i %>
    <br></br>
<%
System.out.println("\n");
out.println("Value of x:"+i);
out.println(test());


for(int i = 0;i<5;i++){
out.println(i);
System.out.println(i);

}

request.setAttribute("X",100);
out.println(request.getAttribute("X"));
%>
<br></br>
<%= new Date()
%>


</head>
<body>
<table>

</table>
</body>
</html>
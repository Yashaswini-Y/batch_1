<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="profile">
      <label for="uname"><b>UserName</b></label>
      <input type="text" name="uname" required><br>
      <label for="psw"><b>Password</b></label>
      <input type="password" name="psw" required><br>
<label>Role</label>
             <select id = "myList">
              <option value = ""></option>
               <option value = "Admin">Admin</option>
               <option value = "User">User</option>
               <option value = "Agent">Agent</option>
             </select>
</form>
</body>
</html>
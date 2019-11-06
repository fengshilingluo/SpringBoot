<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
<c:forEach  items="${requestScope.users}" var="user">
 <h1>
     <ul>
         <li>${user.id}</li>
         <li>${user.username}</li>
         <li>${user.password}</li>
         <li>${user.age}</li>
     </ul>
 </h1>
</c:forEach>
</body>
</html>
<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
   <form action="${pageContext.request.contextPath}/receive/r4" method="post">
     爱好   唱跳<input type="checkbox" value="1" name="hobby">篮球<input type="checkbox"  value="2" name="hobby">Rap<input type="checkbox" name="hobby"  value="3">
       <input type="submit" value="提交"/>
   </form>
</body>
</html>
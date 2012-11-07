<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/login.js"></script>
<title>login</title>
</head>
<body>
<h3>login</h3>
<form action="./login" method="post">
username:<input type="text" name="username"/><br><br>
password:<input type="text" name="password"/><br><br>
<input type="hidden" name="servletname" value="login"/>
<input type="submit" value="login"/>
</form>
<div>
-------------------------------------------
</div>
<a href="void:javascript(0)" id="register">register</a>
<div id="registerDiv">
email:<input type="text" name="email"/><br><br>
username:<input type="text" name="username"/><br><br>
password:<input type="text" name="password"/><br><br>
<input type="submit" value="register now"/>
</div>
</body>
</html>
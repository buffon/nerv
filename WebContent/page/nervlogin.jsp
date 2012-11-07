<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="common.html" flush="true" />
<link rel="stylesheet" type="text/css" href="nervlogin.css" />
<script type="text/javascript" src="nervlogin.js"></script>
<title>login</title>
</head>
<body>
<div id="title">
<h2>welcome, make yourself fun &reg;</h2>
</div>
<div id="login" class="back">
<br>
login
<br><br>
<form action="./login" method="post">
username:<input type="text" name="username"/><br><br>
password:<input type="text" name="password"/><br><br>
<input type="hidden" name="servletname" value="login"/>
<input type="submit" value="login" id="submit"/>
</form>
<br>
no account,<a href="" id="reg">register</a>here
<br><br>
</div>
<div id="pic">
<img src="fun.jpg" />
</div>

<div id="foot">
life is like a box of chocolate.you never know what you're gonna get next. -- yehuichen
</div>

<div id="register" style="display: none">
<br>
register<br><br>
<form action="./login" method="post">
email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email"/><br><br>
username:<input type="text" name="username"/><br><br>
password:<input type="text" name="password"/><br><br>
<input type="radio" name="sex" value="boy">boy
<input type="radio" name="sex" value="girl">girl<br><br>
<input type="hidden" name="servletname" value="register"/>
<input type="submit" value="register" id="submit"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="close" id="button"/><br>
<br>
</form>
</div>
</body>
</html>
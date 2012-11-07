<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<jsp:include page="page/common.html" flush="true" />
<script language="javascript" type="text/javascript" src="js/index.js"></script>
<title>Index</title>
</head>
<body>
<h3>login</h3>
<a href="javascript:void(0);" id="addlink">register</a>
<a href="javascript:void(0);" id="querylink">query</a><br><br>
<div>
<select name="just" id="select">  
   <option value="1">18-21</option> 
   <option value="2">22-25</option>
   <option value="3">26-29</option>
   <option value="4">30-35</option>
   <option value="5">Over35</option> 
  </select>  
 </div>
<div id="addcontent">
<br>
<h3>welcome</h3>
<form>
email:<input type="text" id="email"/><br>
username:<input type="text" id="username"/><br>
password:<input type="text" id="password"/><br>
<br>
<a href="javascript:void(0);" id="addlink2">register</a>
</form>
</div>
</body>
</html>
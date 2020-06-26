<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<link rel="stylesheet" href="loginUI.css">
<head>
<title>ログイン</title>	
</head>
<body>

<form action="LoginServlet" method="POST">
    <input id = "ID" name="empID" type="number" placeholder="従業員ID">
    <input id = "pass" name="password" type="text" placeholder="パスワード">
    <input id = "submit_button" type="submit"  value="ログイン">
</form>
</body>
</html>



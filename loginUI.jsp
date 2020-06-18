<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>ログイン画面</h1>
	
<h2>従業員ID:</h2>

<form action="NewServlet" method="POST">
    <input name="empID" type="text">
    <input type="submit">
</form>

<h2>パスワード:</h2>

<form action="NewServlet" method="POST">
    <input name="password" type="text">
    <input type="submit">
</form>


</body>
</html>


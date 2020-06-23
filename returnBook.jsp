<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>貸出承認</title>
</head>

<body>

<form action="ReturnBookServlet" method="POST">
    <h2>ISBNを入力してください</h2>
    <input name="isbnUi" type="number">
    <h2>従業員IDを入力してください</h2>
    <input name="employeeUi" type="number">
    <input type="submit">
</form>

</body>
</html>
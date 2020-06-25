<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
	<title>書籍在庫数変更</title>
</head>
<body>


<form action="UpdateInventoryServlet" method="POST">
    <h2>ISBNを入力してください</h2>
    <input name="ISBN" type="number">
    <h2>在庫数を入力してください</h2>
    <input name="inventory" type="number">
    <input type="submit">
</form>
	<a href="updateBook.jsp" >登録変更メニューに戻る</a>

</body>
</html>


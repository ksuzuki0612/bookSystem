<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
	<title>Untitled</title>
</head>

<body>
<form action="UpdateLendServlet" method="POST">
    <h2>ISBNを入力してください</h2>
    <input name="ISBN" type="number">
    <h2>貸出数を入力してください</h2>
    <input name="addBorrowedAmount" type="number">
    <input type="submit">
</form>
	<a href="updateBook.jsp" >登録変更メニューに戻る</a>
</body>
</html>
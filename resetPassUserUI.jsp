<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<link rel="stylesheet" href="Password.css">
<body>

<h1 id = "reset">パスワードを再設定しますか？</h1>

<form action="ResetPasswordUserServlet" method="POST">
	<div class = "box">
    <label for="radio1"><input id = "radio1" type="radio" name="ans" class = "radio" value= 1>はい</label><br>
    <label for="radio2"><input id = "radio2" type="radio" name="ans" class = "radio" value= 2>いいえ</label><br>
    </dd>
    <input id = "submit" type="submit" value = "送信">
</form>

</body>
</html>

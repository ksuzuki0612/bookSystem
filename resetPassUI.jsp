<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>パスワードを再設定しますか？</h1>
<h2>1.はい　2.いいえ</h2>

<form action="ResetPasswordServlet" method="POST">
    <input name="ans" type="number">
    <input type="submit">
</form>

</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<link rel="stylesheet" href="Password.css">
<title>パスワード再設定</title>
<body>

<h3 id = "wrongPass">パスワードまたはIDが間違っています。</h3>
<h3 id = "reInput">再入力してください。</h3>

<form action="LoginServlet" method="POST">
    <input id = "pass" name="empID" type="number" placeholder="従業員ID">
    <input id = "newPass" name="password" type="text" placeholder="パスワード">
    <input id = "submit_button" type="submit"  value="ログイン">
</form>
</body>
</html>
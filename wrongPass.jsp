<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>パスワードまたはIDが間違っています。</h1>
<h1>再入力してください</h1>

<form action="LoginServlet" method="POST">
    <h2>従業員ID</h2>
    <input name="empID" type="text">
    <h2>パスワード</h2>
    <input name="password" type="text">
    <input type="submit">
</form>
</body>
</html>
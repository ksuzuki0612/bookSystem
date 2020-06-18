<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>パスワード再設定</h1>

<form action="NewServlet" method="POST">
    <h2>従業員ID</h2>
    <input name="empID" type="number">
    <h2>新しいパスワード</h2>
    <input name="newPassword" type="text">
    <h2>パスワード再入力</h2>
    <input name="checkPassword" type="text">
    <input type="submit">
</form>

</body>
</html>

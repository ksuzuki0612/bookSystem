<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<link rel="stylesheet" href="Password.css">
<title>パスワード再設定</title>
<body>

<form action="ChangePasswordAdminServlet" method="POST">
    <input id = "ID" name="empID" type="number" placeholder="従業員ID">
    <input id = "pass" name="password" type="text" placeholder="新しいパスワード">
    <input id = "newPass" name="checkPassword" type="text" placeholder="パスワード確認">
    <input id = "submit_button2" type="submit"  value="変更">
</form>

</body>
</html>

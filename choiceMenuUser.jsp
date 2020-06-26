<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<p>機能を選択してください</p>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
1.図書館利用者機能
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
2.図書館管理者機能
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
3.パスワードの再設定
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
4.終了
</div>
    
<form action="MainMenuUser" method="POST">
    <input name="choiceUser" type="number">
    <input type="submit" value="送信">
</form>

</body>
</html>

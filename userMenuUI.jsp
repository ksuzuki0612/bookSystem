<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; border-radius: 10px; background-color: #0f65e7; color: #ffffff; width:300px;">
    トップメニュー
</div>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; background-color: #0f65e7; color: #ffffff; width:300px;">
    Welcome!
</div>

<p>メニュー番号を入力してください</p>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
    1.検索
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
    2.予約取消
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
    3.戻る
</div>

<form action="FunctionUserServlet" method="POST">
    <input name="selectedUser" type="number">
    <input type="submit" value="送信">
</form>

</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; border-radius: 10px; background-color: #0f65e7; color: #ffffff; width:300px;">
    トップメニュー
</div>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; background-color: #0f65e7; color: #ffffff; width:300px;">
    Welcome!
</div>

<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
1.図書登録
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
2.図書削除
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
3.登録変更
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px; ">
4.貸出承認
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
5.返却受け取り
</div>
<div style="padding: 10px; margin-bottom: 10px; border-style: none; text-align:center; background-color: #0f65e7; color: #ffffff; width:300px;">
6.戻る
</div>

<p>メニュー番号を入力してください</p>

<form action="FunctionAdminServlet" method="POST">
    <input name="selectedAdmin" type="number">
    <input type="submit" value="送信">
</form>

</body>
</html>

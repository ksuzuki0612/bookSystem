<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>メニュー画面</h1>
<h2>1.図書登録</h2>
<h2>2.図書削除</h2>
<h2>3.登録変更</h2>
<h2>4.貸出承認</h2>
<h2>5.返却受け取り</h2>
<h2>6.戻る</h2>
<h2>メニュー番号を入力してください</h2>

<form action="MainMenuS" method="POST">
    <input name="selectedAdmin" type="number">
    <input type="submit">
</form>

</body>
</html>

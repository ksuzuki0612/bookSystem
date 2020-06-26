<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>返却受取</title>
    <link rel="stylesheet" href="returnBook.css">
</head>

<body>

<form action="ReturnBookServlet" method="POST">
    <h2>ISBNを入力してください</h2>
    <div class = "input_wrapper">
        <input name="isbnUi" type="number">
    </div>
    <h2>従業員IDを入力してください</h2>
    <div class = "input_wrapper">
        <input name="employeeUi" type="number">
    </div><br><br><br>
    <div class = "button_wrapper">
        <button class = "button5" type="submit">送信</button>
    </div>
</form>

<a href="adminMenuUI.jsp" >更新メニューに戻る</a>

</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>各項目を入力してください。</h1>

<form action="BorrowBookServlet" method="POST">
    <h2>ISBN</h2>
    <input name="lendISBN" type="text">
    <h2>従業員ID</h2>
    <input name="borrowempID" type="text">
    <h2>貸出開始日</h2>
    <input name="borrowStart" type="text">
    <h2>貸出終了日</h2>
    <input name="borrowEnd" type="text">
    <input type="submit">
</form>

</body>
</html>
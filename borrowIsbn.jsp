<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>お借りしたい書籍のISBNを入力してください。</h1>

<form action="CheckBorrowServlet" method="POST">
    <h2>ISBN</h2>
    <input name="borrowISBN" type="text">
    <input type="submit">
</form>

</body>
</html>
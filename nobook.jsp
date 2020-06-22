<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>削除したい書籍がありません。</h1>
<h1>ISBNを再入力してください。</h1>

<form action="DeleteBookServlet" method="POST">
    <h2>ISBN</h2>
    <input name="deleteISBN" type="text">
    <input type="submit">
</form>

</body>
</html>
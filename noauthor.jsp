<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>探している著者の書籍がありません。</h1>
<h1>著者名を再入力してください。</h1>

<form action="AuthorCheckServlet" method="POST">
    <h2>ISBN</h2>
    <input name="searchauthor" type="text">
    <input type="submit">
</form>

</body>
</html>
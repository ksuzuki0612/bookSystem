<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>探している分野の書籍がありません。</h1>
<h1>分野を再入力してください。</h1>

<form action="CategoryCheckServlet" method="POST">
    <h2>分野</h2>
    <input name="searchauthor" type="text">
    <input type="submit">
</form>

</body>
</html>
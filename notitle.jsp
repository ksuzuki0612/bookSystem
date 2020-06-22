<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>探しているタイトルの書籍がありません。</h1>
<h1>タイトルを再入力してください。</h1>

<form action="TitleCheckServlet" method="POST">
    <h2>分野</h2>
    <input name="searchtitle" type="text">
    <input type="submit">
</form>

</body>
</html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<link rel="stylesheet" href="search.css">
<body>

<h1>検索する項目を選んでください</h1>


<form action="SearchMenuServlet" method="POST">
    タイトル<input type="radio" name="searchselect" value="0"><br>
    著者<input type="radio" name="searchselect" value="1"><br>
    分野<input type="radio" name="searchselect" value="2"><br>
    戻る<input type="radio" name="searchselect" value="3"><br>
	<input type="submit" value="選択">
</form>


</body>
</html>
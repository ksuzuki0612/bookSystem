<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<link rel="stylesheet" href="search.css">
<head>

</head>
<body>


<h2>タイトル</h2>
<form action="SearchTitleServlet" method="POST">
    
    <input id="search" name="searchauthor" type="text" placeholder="タイトル">
    <input id="submitbutton" type="submit" value="検索" placeholder="検索">
    
</form>

<form action="searchMenu.jsp" method="POST">
    <input id="returnbutton" type="submit" value="戻る" placeholder="検索">

</form>

</body>
</html>
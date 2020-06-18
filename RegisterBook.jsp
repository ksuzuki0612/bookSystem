<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
	<title>RegisterBook</title>
</head>

<body>

	<h1>ISBNを入力してください</h1>

    <%String isbn = (String)request.getParameter("isbn");%> 
    <form action="AdminMenu" method="POST">
    	<input name="isbn" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍名を入力してください</h1>

    <%String title = (String)request.getParameter("title");%> 
    <form action="AdminMenu" method="POST">
    	<input name="title" type="text">
    	<input type="submit">
    </form>
    	
    <h1>出版社を入力してください</h1>

    <%String publisher = (String)request.getParameter("publisher");%> 
    <form action="AdminMenu" method="POST">
    	<input name="publisher" type="text">
    	<input type="submit">
    </form>
    	
    <h1>出版日を入力してください</h1>

    <%String strDate = (String)request.getParameter("strDate");%> 
    <form action="AdminMenu" method="POST">
    	<input name="strDate" type="text">
    	<input type="submit">
    </form>
    	
    <h1>分野を入力してください</h1>

    <%String field = (String)request.getParameter("field");%> 
    <form action="AdminMenu" method="POST">
    	<input name="field" type="text">
    	<input type="submit">
    </form>
    	
    <h1>著者を入力してください</h1>

    <%String str4 = (String)request.getParameter("str4");%> 
    <form action="AdminMenu" method="POST">
    	<input name="str4" type="text">
    	<input type="submit">
    </form>
    	
    <h1>在庫数を入力してください</h1>

    <%String inventory = (String)request.getParameter("inventory");%> 
    <form action="AdminMenu" method="POST">
    	<input name="inventory" type="text">
    	<input type="submit">
    </form>
    	
    <h1>貸出数を入力してください</h1>

    <%String borrowedAmountUi = (String)request.getParameter("borrorwedAmountUi");%> 
    <form action="AdminMenu" method="POST">
    	<input name="borrowedAmountUi" type="text">
    	<input type="submit">
    </form>

</body>
</html>
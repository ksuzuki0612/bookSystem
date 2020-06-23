<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
	<title>書籍編集</title>
</head>
<body>
    <h1>編集項目を選択してください</h1>
     <br/>1.在庫変更<br/>
     <br/>2.貸出本の更新<br/>
     <br/>3.終了<br/>
    <form action="UpdateBookServlet" method="POST">
    	<input name="selectedUi" type="number">
    	<input type="submit">
    </form>
 

</body>
</html>

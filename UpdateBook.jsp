<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
	<title>UpdateBook</title>
</head>

<body>

    <h1>編集項目を選択してください</h1>
    <%
      String selected = (String)request.getParameter("selected");
      out.println("<br/>1.在庫変更<br/>");
      out.println("<br/>2.貸出本の更新<br/>");
      out.println("<br/>3.終了<br/>");
	      %> 
    <form action="AdminMenu" method="POST">
    	<input name="selected" type="text">
    	<input type="submit">
    </form>
    		  
    <h1>ISBNを入力してください</h1>

    <%String deleteISBN = (String)request.getParameter("deleteISBN");%> 
    <form action="AdminMenu" method="POST">
    	<input name="deleteISBN" type="text">
    	<input type="submit">
    </form>
    	
    <h1>貸出期限を入力してください</h1>

    <%String bookPeriod = (String)request.getParameter("bookPeriod");%> 
    <form action="AdminMenu" method="POST">
    	<input name="bookPeriod" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍数を入力してください</h1>

    <%String addInventory = (String)request.getParameter("addInventory");%> 
    <form action="AdminMenu" method="POST">
    	<input name="addInventory" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍の貸出数を入力してください</h1>

    <%String addBorrowedAmount = (String)request.getParameter("addBorrowedAmount");%> 
    <form action="AdminMenu" method="POST">
    	<input name="addBorrowedAmount" type="text">
    	<input type="submit">
    </form>
    	
    <h1>メニューに戻る</h1>
    <%
    	int returnMainMenu = 0;
        int count = 0;
        do{
            count++;
            if(count>1){
                System.out.println("再度入力してください");
            }
            System.out.println("ひとつ前のメニューに戻る場合は１、作業を始める場合は２を入力してください");
            returnMainMenu = new java.util.Scanner(System.in).nextInt();
        }
        while(!(returnMainMenu == 1||returnMainMenu == 2));
    	%> 
    <form action="AdminMenu" method="POST">
    	<input name="returnMainMenu" type="text">
    	<input type="submit">
    </form>


</body>
</html>

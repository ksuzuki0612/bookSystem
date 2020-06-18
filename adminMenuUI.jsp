<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>UI-adminPart</title>
</head>

<body>
	<h1>ISBNを入力してください</h1>

    <%String isbn = (String)request.getParameter("isbn");%> 
    <form action="NewServlet" method="POST">
    	<input name="isbn" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍名を入力してください</h1>

    <%String title = (String)request.getParameter("title");%> 
    <form action="NewServlet" method="POST">
    	<input name="title" type="text">
    	<input type="submit">
    </form>
    	
    <h1>出版社を入力してください</h1>

    <%String publisher = (String)request.getParameter("publisher");%> 
    <form action="NewServlet" method="POST">
    	<input name="publisher" type="text">
    	<input type="submit">
    </form>
    	
    <h1>出版日を入力してください</h1>

    <%String strDate = (String)request.getParameter("strDate");%> 
    <form action="NewServlet" method="POST">
    	<input name="strDate" type="text">
    	<input type="submit">
    </form>
    	
    <h1>分野を入力してください</h1>

    <%String field = (String)request.getParameter("field");%> 
    <form action="NewServlet" method="POST">
    	<input name="field" type="text">
    	<input type="submit">
    </form>
    	
    <h1>著者を入力してください</h1>

    <%String str4 = (String)request.getParameter("str4");%> 
    <form action="NewServlet" method="POST">
    	<input name="str4" type="text">
    	<input type="submit">
    </form>
    	
    <h1>在庫数を入力してください</h1>

    <%String inventory = (String)request.getParameter("inventory");%> 
    <form action="NewServlet" method="POST">
    	<input name="inventory" type="text">
    	<input type="submit">
    </form>
    	
    <h1>在庫数を入力してください</h1>

    <%String borrowedAmountUi = (String)request.getParameter("borrorwedAmountUi");%> 
    <form action="NewServlet" method="POST">
    	<input name="borrowedAmountUi" type="text">
    	<input type="submit">
    </form>
    	
    <h1>編集項目を選択してください</h1>
    <%
      String selected = (String)request.getParameter("selected");
      out.println("<br/>1.在庫変更<br/>");
      out.println("<br/>2.貸出本の更新<br/>");
      out.println("<br/>3.終了<br/>");
	      %> 
    <form action="NewServlet" method="POST">
    	<input name="selectedUi" type="text">
    	<input type="submit">
    </form>
    		  
    <h1>ISBNを入力してください</h1>

    <%String deleteISBN = (String)request.getParameter("deleteISBN");%> 
    <form action="NewServlet" method="POST">
    	<input name="deleteISBN" type="text">
    	<input type="submit">
    </form>
    	
    <h1>貸出期限を入力してください</h1>

    <%String bookPeriod = (String)request.getParameter("bookPeriod");%> 
    <form action="NewServlet" method="POST">
    	<input name="bookPeriod" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍数を入力してください</h1>

    <%String addInventory = (String)request.getParameter("addInventory");%> 
    <form action="NewServlet" method="POST">
    	<input name="addInventory" type="text">
    	<input type="submit">
    </form>
    	
    <h1>書籍の貸出数を入力してください</h1>

    <%String addBorrowedAmount = (String)request.getParameter("addBorrowedAmount");%> 
    <form action="NewServlet" method="POST">
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
    <form action="NewServlet" method="POST">
    	<input name="returnMainMenu" type="text">
    	<input type="submit">
    </form>


</body>
</html>
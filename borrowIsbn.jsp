<%@ page contentType="text/html; charset=UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="borrowIsbn.css">
    </head>
<body>

<h1>お借りしたい本のISBNを入力してください。</h1>

<form action="CheckBorrowServlet" method="POST">
    <h2>ISBN</h2>
    <div class = "input_wrapper">
        <input name="borrowISBN" type="text"><br><br><br>
    </div>    
    <div class = "button_wrapper">
        <button class = "button2" type="submit">送信</button>
    </div>
    
</form>

</body>
</html>
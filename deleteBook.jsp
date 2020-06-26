<%@ page contentType="text/html; charset=UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="deleteBook.css">
    </head>
<body>

<h1>削除したい書籍のISBNを入力してください。</h1>

<form action="DeleteBookServlet" method="POST">
    <h2>ISBN</h2>
    <div class = "input_wrapper">
        <input name="deleteISBN" type="text">
    </div><br><br><br>
    <div class = "button_wrapper">
        <button class = "button3" type="submit">送信</button>
    </div>
</form>

</body>
</html>

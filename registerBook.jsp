<%@ page contentType="text/html; charset=UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="registerBook.css">
    </head>
<body>

<h1>書籍の各項目を入力してください。</h1>

<form action="RegisterBookServlet" method="POST">
    <h2>出版日</h2>
    <div class = "input_wrapper">
        <input name="regPubdate" type="text" placeholder="yyyyMMddの形式で入力してください。">
    </div>
    <h2>著者</h2>
    <div class = "input_wrapper">
        <input name="regAuthor" type="text"　placeholder="複数の場合「、」で分けてください。">
    </div>
    <h2>ISBN</h2>
    <div class = "input_wrapper">
        <input name="regISBN" type="text">
    </div>
    <h2>タイトル</h2>
    <div class = "input_wrapper">
        <input name="regTitle" type="text">
    </div>
    <h2>出版社</h2>
    <div class = "input_wrapper">
        <input name="regPublisher" type="text">
    </div>  
    <h2>分野</h2>
    <div class = "input_wrapper">
        <input name="regCategory" type="text">
    </div>
    <h2>在庫数</h2>
    <div class = "input_wrapper">
        <input name="regInv" type="text">
    </div><br><br><br>
    <div class = "button_wrapper">
        <button class = "button4" type="submit">送信</button>
    </div>
</form>

</body>
</html>

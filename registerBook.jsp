<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>書籍の各項目を入力してください。</h1>

<form action="RegisterBookServlet" method="POST">
    <h2>出版日(yyyyMMdd)</h2>
    <input name="regPubdate" type="text">
    
    <h2>著者(複数の場合「、」で分けてください)</h2>
    <input name="regAuthor" type="text">
    
    <h2>ISBN</h2>
    <input name="regISBN" type="text">
    
    <h2>タイトル</h2>
    <input name="regTitle" type="text">
    
    <h2>出版社</h2>
    <input name="regPublisher" type="text">
    
    <h2>分野</h2>
    <input name="regCategory" type="text">
    
    <h2>在庫数</h2>
    <input name="regInv" type="text">
    <input type="submit">
</form>

</body>
</html>

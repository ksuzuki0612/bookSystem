<%@ page contentType="text/html; charset=UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" href="borrowBook.css">
    </head>
<body>

    <h1>各項目を入力してください。</h1>

<form action="BorrowBookServlet" method="POST">
    <table>
        <tr>
            <th>ISBN</th><th>従業員ID</th><th>貸出開始日</th><th>貸出終了日</th>
        </tr>
        <tr>
            <td><input name="lendISBN" type="text"></td>
            <td><input name="borrowempID" type="text"></td>
            <td><input name="borrowStart" type="text"></td>
            <td><input name="borrowEnd" type="text"></td>
        </tr>
    </table><br><br><br>
    <button class = "button1" type="submit">送信</button>

    <h2>ISBN</h2>
    <input name="lendISBN" type="text">
    <h2>従業員ID</h2>
    <input name="borrowempID" type="text">
    <h2>貸出開始日</h2>
    <input name="borrowStart" type="text">
    <h2>貸出終了日</h2>
    <input name="borrowEnd" type="text"><br><br><br>
    <button class = "button1" type="submit">送信</button>
</form>

</body>
</html>
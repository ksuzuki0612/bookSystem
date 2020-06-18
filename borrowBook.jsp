<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>各項目に入力してください。</h1>

<form action="BorrowBookServlet" method="POST">
    <h2>ISBN</h2>
    <input name="ISBN" type="text">
    <input type="submit">
    <h2>従業員ID</h2>
    <input name="empID" type="text">
    <input type="submit">
    <h2>貸出開始日(YYYY-MM-dd)。</h2>
    <input name="borrowFrom" type="text">
    <input type="submit">
    <h2>貸出終了日(YYYY-MM-dd)。</h2>
    <input name="borrowTill" type="text">
    <input type="submit">
    
</form>

</body>
</html>
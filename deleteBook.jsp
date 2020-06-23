<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>Enter the ISBN of the book you wish to delete.</h1>

<form action="DeleteBookServlet" method="POST">
    <h2>ISBN</h2>
    <input name="deleteISBN" type="text">
    <input type="submit">
</form>

</body>
</html>
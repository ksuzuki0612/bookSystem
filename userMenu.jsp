<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<h1>検索する項目を選んでください</h1>
<h2>1.タイトル</h2>
<h2>2.著者</h2>
<h2>3.分野</h2>
<h2>4.戻る</h2>

<form action="NewServlet" method="POST">
    <input name="str" type="text">
    <input type="submit">
</form>

<%
session.setAttribute("count","str");
%>

<c:if test="${count == 1}">

</c:if>

<c:if test="${count == 2}">

</c:if>

<c:if test="${count == 3}">

</c:if>

<c:if test="${count == 4}">

</c:if>

<c:if test="${count != 1,2,3,4}">
    再度入力してください
</c:if>

</body>
</html>
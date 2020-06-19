<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<%
  boolean pass = (boolean)request.getAttribute("result");
  if(pass == true){
      out.println("パスワードが更新されました");

  }else{
      out.println("パスワードの更新に失敗しました");
  }
%>

<a href="choiceMenuAdmin.jsp">メニュー画面に戻る</a>

</body>
</html>

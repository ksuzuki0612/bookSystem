<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<%
  boolean pass = session.getAttribute("result");
  if(pass == true){
      out.println("パスワードが更新されました");

  }else{
      out.println("パスワードの更新に失敗しました");
  }
%>

<a href="choiceMenuUser.jsp">メニュー画面に戻る</a>

</body>
</html>

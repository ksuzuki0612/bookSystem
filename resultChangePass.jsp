<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<%
  String pass = session.getAttribute("result");
  if(pass == true){
      out.println("パスワードが更新されました");
  }else{
      out.println("パスワードの更新に失敗しました");
  }
%>

</body>
</html>

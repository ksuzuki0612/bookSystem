<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<body>

<%
	try{
		boolean pass = (boolean)session.getAttribute("result");
  		if(pass == true){
      		out.println("パスワードが更新されました");

  		}else{
      		out.println("パスワードの更新に失敗しました");
  		}
	}
	catch(Exception e){
		out.println("例外が発生し，パスワードの更新に失敗しました");
		e.printStackTrace();
		out.println(e);
	}
%>

<a href="choiceMenuUser.jsp">メニュー画面に戻る</a>
</body>
</html>

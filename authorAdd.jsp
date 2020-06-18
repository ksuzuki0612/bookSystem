<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
	
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>authorAdd</title>
</head>

<body>

    <h1>著者を追加する場合は１、行わない場合は２を入力してください</h1>

    <%int authorAdd=0;
    String authorAdd = (String)request.getParameter("authorAdd");
        do{
            authorAdd = 0;
            System.out.println("著者を追加する場合は１、行わない場合は２を入力してください");
             authorAdd = new java.util.Scanner(System.in).nextInt();
        }
        while(!(authorAdd ==1 ||authorAdd ==2));
            logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
            return authorAdd;%> 
            	
    <form action="UI" method="POST">
    	<input name="authorAdd" type="text">
    	<input type="submit">
    </form>

</body>
</html>

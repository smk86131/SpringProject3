<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<from action="./userJoinAction.jsp" method = "post">
	<input type="text" name="userID">
	<input type="password" name="userPassword">
	<input type="submit" value="회원가입">
</from>
<from action="./UseDB" method="post">
	<input type="submit" value="조회">
</from>

</body>
</html>
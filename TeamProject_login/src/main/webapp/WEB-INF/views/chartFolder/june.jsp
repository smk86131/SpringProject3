<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>6월 차트</title>
<style>
	table,tr,th,td {
		border: 1px solid black;
	}
	td {
		padding : 4px;
	}
	a {
		text-decoration : none;
		background-color : #aaa;
		padding: 3px;
		margin: 2px; 
		border-radius: 5px;
	}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
	<h3>6월 차트</h3>
	
	<div>
	<table>
			<tr>
				<th>idx</th>
				<th>artist</th>
				<th>songName</th>
				<th>soundSource</th>
				<th>onAir</th>
				<th>total</th>
			</tr>
			<c:forEach items="${june_list}" var="dto">
				<tr>
					<td>${dto.idx}</td>
					<td>${dto.artist}</td>
					<td>${dto.songName}</td>
					<td>${dto.soundSource}</td>
					<td>${dto.onAir}</td>
					<td>${dto.total}</td>
				</tr>
			</c:forEach>
	</table>	
	</div>
</body>
</html>
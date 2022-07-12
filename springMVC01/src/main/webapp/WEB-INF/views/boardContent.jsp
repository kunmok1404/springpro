<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Spring MVC01</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC01</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD</div>
    <div class="panel-body">
    	<table class="table">
    		<tr>
    			<td>제목</td>
    			<td>${boardDto.title}</td>
    		</tr>
    		<tr>
    			<td>내용</td>
    			<td>${boardDto.content}</td>
    		</tr>
    		<tr>
    			<td>작성자</td>
    			<td>${boardDto.writer}</td>
    		</tr>
    		<tr>
    			<td>작성일</td>
    			<td>${boardDto.indate}</td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    				<button class="btn btn-primary btn-sm">수정화면</button>
    				<button class="btn btn-primary btn-sm">삭제</button>
    				<button class="btn btn-primary btn-sm">목록</button>
    			</td>
    		</tr>
    	</table>
    </div>
    <div class="panel-footer">스프1탄_TED</div>
  </div>
</div>

</body>
</html>

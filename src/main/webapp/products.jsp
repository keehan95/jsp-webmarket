<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="dto.Product" %>
    
<jsp:useBean id="repository" class="dao.ProductRepository" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<%
	// useBean을 안쓰면 아래를 추가해주면 된다.
	// ProductReposutory repository = new ProductRepository
	List<Product> products = repository.getAllProducts();
	for (Product product: products) {
		out.println(product + "<br><br>");
	}
	%>
</body>
</html>
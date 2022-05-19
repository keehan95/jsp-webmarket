<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="dto.Product" %>

<!-- session 서버측에 저장 -->
<jsp:useBean id="repository" class="dao.ProductRepository" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	
	<div class="p-5 bg-primary text-white">
		<!-- container: 좌우 가운데 정렬-->
	    <div class="container">
	    	<!-- display-3: 큰 글자 중에 보통 크기-->
	        <h1 class="display-3">
	        	상품 목록
	        </h1>
	    </div>
	</div>
	<%
	// useBean을 안쓰면 아래를 추가해주면 된다. 
	// useBean은 하나의 인스턴스를 재활용하고
	// 아래 코드는 new로 새로 만든다.
	// ProductReposutory repository = new ProductRepository
	List<Product> products = repository.getAllProducts();
	
	%>
	
	<div class="container">
	    <div class="row text-center">
	    	<%
	    	for(Product product: products) {
	    	%>
	    		<div class="col-md-4">
		    		<h3><%= product.getName() %></h3>
		    		<p><%= product.getDescription() %></p>
		    		<p><%= product.getUnitPrice() %>원</p>
		    		<p>
			    		<a class="btn btn-secondary" role="button" href="./product.jsp?id=<%= product.getProductId() %>">
			    			상세 정보 &raquo;
			    		</a>
		    		</p>
	    		</div>
	    	<%
	    	}
	    	%>
	    </di>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
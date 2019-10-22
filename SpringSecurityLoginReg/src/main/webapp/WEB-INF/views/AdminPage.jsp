
<html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body background="${pageContext.request.contextPath}img/admin.jpg">

<h1 style="color:red;text-align:center">Welcome to Adminaaaaa Page!!</h1>
<img src="/src/main/webapp/img/admin.jpg" height="10px" width="10px" >
<img src="<c:url value="././img/admin.jpg" />" alt="image" />

<img src="${pageContext.request.contextPath}/webapp/img/admin.jpg" />

<a href="logout">Logout</a>
<span>




</span>
</body>
</html>
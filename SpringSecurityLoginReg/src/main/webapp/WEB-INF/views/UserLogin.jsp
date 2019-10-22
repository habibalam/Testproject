<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body bgcolor="yellow">

<h3 style="color:red;text-align:center">Welcome to Spring User Login Page</h3>

<c:if test="${param.error!=null}">
 <div style="color: red;">Invalid Username/password</div>
</c:if>
<c:if test="${param.logout!=null}">
 <div style="color: green;">Logout successful</div>
</c:if>
<center>
<form action="login" method="post">
<pre>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
Username : <input type="text" name="username"/>
Password : <input type="password" name="password"/>
<input type="submit" value="Login"/>
</pre>
</form></center>
<h2 style="color:blue;text-align:center;">Dont you have Account? <a href="register">Click Here</a></h2>

</body>
</html>






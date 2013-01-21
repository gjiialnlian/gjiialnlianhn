<%@ include file="../includes/includes.jsp" %> 
<!doctype html>
<html>
<head>
<%@ include file="login/head.jsp" %> 
</head>
<body id="login-bg"> 
<div id="login-holder">
	<div id="logo-login">
		<a href="index.html"><img src="../images/shared/logo.png" width="156" height="40" alt="" /></a>
	</div>
	<div class="clear"></div>
	
	<div id="loginbox">
		<c:if test="${not empty param.login_error}">
		     <div id="error">
		     	<p class="mar0">Login failed. Please try again.</p>
		     	<p class="mar0">Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /></p>
		     </div>    
		</c:if>
		<div id="login-inner">
			<form name="f" action="<c:url value='j_spring_security_check'/>" method="POST">
				<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<th>Username</th>
					<td><input type="text"  class="login-inp" name="j_username"/></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" value="************"  onfocus="this.value=''" class="login-inp" name="j_password"/></td>
				</tr>
				<tr>
					<th></th>
					<td valign="top"><input type="checkbox" class="checkbox-size" id="login-check" /><label for="login-check">Remember me</label></td>
				</tr>
				<tr>
					<th></th>
					<td><button type="submit" class="submit-login" ></button></td>
				</tr>
				</table>
			</form>
		</div>
	<div class="clear"></div>
	<a href="" class="forgot-pwd">Forgot Password?</a>
 	</div>
	<div id="forgotbox">
		<div id="forgotbox-text">Please send us your email and we'll reset your password.</div>
		<div id="forgot-inner">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Email address:</th>
			<td><input type="text" value=""  class="login-inp" /></td>
		</tr>
		<tr>
			<th> </th>
			<td><input type="button" class="submit-login"  /></td>
		</tr>
		</table>
		</div>
		<div class="clear"></div>
		<a href="" class="back-login">Back to login</a>
	</div>
</div>
</body>
</html>

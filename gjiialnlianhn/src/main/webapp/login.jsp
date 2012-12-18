<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=100" />


</head>
<body>
<div class="w635 h353 txtAC mar0 posRel top100 bgsrclogo">

<c:if test="${not empty param.login_error}">
     <div id="error" class="clearB posAbs w100p farial fsize12 fred logAlert">
     	<p class="mar0">Login failed. Please try again.</p>
     	<p class="mar0">Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /></p>
     </div>    
</c:if>

<form name="f" action="<c:url value='j_spring_security_check'/>" method="POST">
<div class="formContainer">
	<label class="labelTxt">Username :</label><label class="labelTxtBox"><input type="text" name='j_username' class="txtbox" /></label><br>
	<label class="labelTxt">Password :</label><label class="labelTxtBox"><input type='password' name='j_password' class="txtbox" /></label>
    
    <div class="clearboth"></div>
    <div class="clearB floatR padT10 marRn5">
    	<input type="hidden" name="submit" value="Submit" />								
		<button type="submit" class="btnSignin" ></button>
    </div>
</div>
</form>


</div>
</body>

</html>

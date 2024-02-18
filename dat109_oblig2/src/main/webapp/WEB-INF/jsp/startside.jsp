<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>ReservasjonsSkjema</title>
    <style>
        .main {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            justify-content: center;
        }
    </style>
</head>
<body>


<fieldset class="main">
	<h1> STARTSIDE: </h1>
	<form:form method="get" action="reserver" >
			<button type="submit">Reserver</button>
	</form:form>

	<form:form method="post" action="hentbil" modelAttribute="hentenavn">
        <input type="text" name="hentenavn" placeholder="Skriv kredittkortnummer" />
        <button type="submit">Hent bil</button>
    </form:form>

	<form:form method="post" action="leverbil" modelAttribute="bilnummer">
        <input type="text" name="bilnummer" placeholder="Skriv Bilnummer" />
        <button type="submit">Lever bil</button>
    </form:form>
</fieldset>


</body>
</html>
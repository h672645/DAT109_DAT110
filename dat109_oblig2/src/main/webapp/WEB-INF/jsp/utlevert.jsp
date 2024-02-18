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
	<h1> UTLEVERT: </h1>
	<br>${navn} har leid bil: ${regNr}
	<br>Pris: ${pris}

</fieldset>
</body>
</html>
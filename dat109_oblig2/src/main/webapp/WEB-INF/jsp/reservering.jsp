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
        }
    </style>
</head>
<body>

<form:form class="main" method="post" action="reserver" modelAttribute="reservasjon">
    <fieldset>
        <br>
        <form:label path="fornavn">Fornavn: </form:label>
        <br>
        <form:input path="fornavn" id="fornavn"/>
        
        <br>
        <form:label path="etternavn">Etternavn: </form:label>
        <br>
        <form:input path="etternavn" id="etternavn"/>
        
        <br>
        <form:label path="adresse">Adresse: </form:label>
        <br>
        <form:input path="adresse" id="adresse"/>
        
        <br>
        <form:label path="telefonnummer">Telefonnummer: </form:label>
        <br>
        <form:input path="telefonnummer" id="telefonnummer"/>
        
        <br>
        <form:label path="kategori">Kategori:</form:label><br>
        <form:select path="kategori">
            <form:option value="Liten">Liten</form:option>
            <form:option value="Stor">Stor</form:option>
            <form:option value="Treg">Treg</form:option>
            <form:option value="Rask">Rask</form:option>
        </form:select>
        
        <br>
        <form:label path="leiedato">Leiedato yyyy-MM-dd: </form:label>
        <br>
        <form:input path="leiedato" id="leiedato"/>
        
        <br>
        <form:label path="kredittkortnummer">Kredittkortnumer: </form:label>
        <br>
        <form:input path="kredittkortnummer" id="kredittkortnummer"/>
        
        <br>
        <button type="submit">Submit</button>
    </fieldset>
</form:form>

</body>
</html>

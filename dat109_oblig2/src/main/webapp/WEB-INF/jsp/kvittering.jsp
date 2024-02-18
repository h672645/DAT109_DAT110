<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Kvittering</title>
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
    <h1>Kvittering</h1>
    <h2>Kundeinformasjon:</h2>
    <p>Fornavn: ${reservasjon.fornavn}</p>
    <p>Etternavn: ${reservasjon.etternavn}</p>
    <p>Adresse: ${reservasjon.adresse}</p>
    <p>Telefonnummer: ${reservasjon.telefonnummer}</p>
    <p>Kreditkortnummer: ${reservasjon.kredittkortnummer}</p>

    <h2>Bilinformasjon:</h2>
    <p>Type: ${reservasjon.kategori}</p>
   

    <h2>Bekreftelse:</h2>
    <p>Din reservasjon er bekreftet.</p>
   </fieldset>
</body>
</html>
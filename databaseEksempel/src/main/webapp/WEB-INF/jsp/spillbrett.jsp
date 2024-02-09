<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>10x10 Board Game</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .board {
            display: grid;
            grid-template-columns: repeat(10, 50px); /* Adjust the size of each cell as needed */
            grid-template-rows: repeat(10, 50px);
            gap: 1px; /* Gap between cells */
            border: 1px solid #000; /* Border color for cells */
        }

        .cell {
            width: 100%;
            height: 100%;
            box-sizing: border-box;
            border: 1px solid #000; /* Border color for grid lines */
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 14px;
            font-weight: bold;
            background-color: #fff; /* Default background color */
            position: relative;
        }
        
        .route-number {
    		position: absolute;
    		top: 0;
    		left: 0;
    		padding: 1px; /* Adjust padding as needed for spacing */
    		font-size: 10px; /* Adjust font size as needed */
		}
        
        
        .Meny{
        	display: inline-grid;
        	width:300px;
        	height:500px;
        }
        
        .terningkast p{
        	width:200px;
        }
        
        .Meny fieldset{
        	margin-top:1px;
        }
        
        .spillerfelt{
        	height:150px;
        	background-color:;
        }
        
        .hvemsintur{
        	background-color:;
        	height:150px;
        }
        
        .spillerkoe{
        	background-color:;
        	height:80px;
        }
        
    </style>
</head>
<body>
    <div class="board">
    	<%--<c:if test="${fn:length(spillerkoe) >= 2}">--%>
         
        	<c:forEach var="rute" items="${ruteliste}">
        		<div class="cell" style="background-color:${rute.verdi < 0 ? '#ffcccb' : '' || rute.verdi > 0 ? 'lightgreen' : ''}" >
        			<c:choose>
        				<c:when test="${rute.rutenummer == 1 || rute.rutenummer == 100}">
        					<div class="route-number" style="font-weight: bolder;font-size: 16px;">${rute.rutenummer == 1 ? 'Start':'Mål'}</div>
        				</c:when>
        				<c:otherwise>
        					<div class="route-number">${rute.rutenummer}<c:if test="${rute.verdi != 0}"> til ${rute.rutenummer + rute.verdi}</c:if></div>
        				</c:otherwise>
        			</c:choose>
        			<c:forEach var="spiller" items="${spillerkoe}">
        				<c:if test="${spiller.rutelokasjon == rute.rutenummer}">
        					<br>${spiller.navn}
        				</c:if>
        			</c:forEach>
        		</div>
        	
        	</c:forEach>
        <%--></c:if>--%>
    </div>
    <fieldset class="Meny"> 
    	<div class="Registrer">
    		<form:form method="post" action="leggTilSpiller" modelAttribute="spiller">
            	<fieldset class="spillerfelt">
            		<form:label path="navn">Navn:</form:label>
					<form:input path="navn" id="navn"/>
                	<button type="submit">Legg til spiller</button>
                	<c:if test="${not empty lagtTil}"><p style="color:green">${lagtTil}</p></c:if>
                	<c:if test="${not empty ikkeLagtTil}"><p style="color:red">${ikkeLagtTil}</p></c:if>
                	<c:if test="${fn:length(spillerkoe) == 1}"><p style="color:red">Venligst legg til 1 spiller til</p></c:if>
    				<c:if test="${fn:length(spillerkoe) == 0}"><p style="color:red">Venligst legg til 2 spillere</p></c:if>
            	</fieldset>
    		</form:form>
    	</div>
    
    	<div>Spillerkø:
    		<fieldset class="spillerkoe">
    			<c:forEach var="spiller" items="${spillerkoe}">
    				<c:out value="${spiller.navn}"></c:out><br>
    			</c:forEach>
    		</fieldset>
    	</div>Hvem sin tur:
    		<fieldset class="hvemsintur">
    			<form:form method="post" action="trillTerning">
            	
            			<c:if test="${not empty hvemSinTur}">
            				<p style="color:blue">Det er ${hvemSinTur} sin tur:</p>
            			</c:if>
                		<c:if test="${fn:length(spillerkoe) >= 2}">
                			<c:if test="${empty terningkast}">
                				<button type="submit">Trill terning</button>
                			</c:if>
            			</c:if>
        		</form:form>
    		
    		
    			<form:form method="post" action="flyttBrikke">
    				<c:if test="${not empty flyttet}">
    					<p>Oi! Du havnet på rute ${spesialrute} som er en ${flyttet < 0 ? 'slange':'stige'} og du ble flyttet ${flyttet} ${flyttet < 0 ? 'tilbake':'fram'}</p>
    				</c:if>
    			
    				<c:if test="${not empty terningkast}">
    					<button type="submit">Flytt spiller</button>
    				</c:if>
    				<c:if test="${not empty terningkast}">
    					<p>Du trillet: ${terningkast}</p>
    				</c:if>
    				<c:if test="${not empty uflaks}">
    					<p>${uflaks}</p>
    				</c:if>
    				<c:if test="${not empty maalgang}">
    					<p>${maalgang}</p>
    				</c:if>
    			</form:form>
    		</fieldset>
    </fieldset>
</body>
</html>

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
        }

        /* Optional: Add styles for different colors or patterns to represent different states on the board */
        .cell.player1 {
            background-color: #66c2ff; /* Light blue for player 1 */
        }

        .cell.player2 {
            background-color: #ff6666; /* Light red for player 2 */
        }
    </style>
</head>
<body>
    <div class="board">
    	
        <c:if test="${fn:length(spillerkoe) >= 2}">
        <c:forEach var="rute" items="${ruteliste}">
        	<div class="cell" style="color:${rute.verdi < 0 ? 'red' : '' || rute.verdi > 0 ? 'green' : ''}" >
        		<c:out value="${rute.rutenummer}"></c:out>
        		
        		<c:if test="${rute.rutenummer == 1 || rute.rutenummer == 100}">
        			<br>${rute.rutenummer == 1 ? 'Start':'Mål'}
        		</c:if>
        		<c:forEach var="spiller" items="${spillerkoe}">
        		<c:if test="${spiller.rutelokasjon == rute.rutenummer}">
        			<br>${spiller.navn}
        		</c:if>
        	</c:forEach>
        	</div>
        	
        </c:forEach>
        </c:if>
        <%-- Repeat the above cell div for the total number of cells (100 in this case) --%>
        <%-- You can use a loop or other methods to generate these cells dynamically --%>
    </div>
    <div class="Meny"> Meny:
    	<div class="Registrer">
    		<form:form method="post" action="leggTilSpiller" modelAttribute="spiller">
            	<fieldset>
            		
            		<form:label path="navn">Navn:</form:label>
					<form:input path="navn" id="navn"/>
					
                	<button type="submit">Legg til spiller</button>
                	<p style="color:green">${lagtTil}</p>
                	<p style="color:red">${ikkeLagtTil}</p>
                	<p style="color:red"><c:if test="${fn:length(spillerkoe) == 1}">Venligst legg til 1 spiller til</c:if></p>
    				<p style="color:red"><c:if test="${fn:length(spillerkoe) == 0}">Venligst legg til 2 spillere</c:if></p>
            	</fieldset>
    		</form:form>
    	</div>
    
    	<div class="Spillerkoe">Spillerkø:
    		<fieldset>
    			<c:forEach var="spiller" items="${spillerkoe}">
    				<c:out value="${spiller.navn}"></c:out><br>
    			</c:forEach>
    		</fieldset>
    	</div>
    	<fieldset>
    	<div class="spiller">Hvem sin tur:
    		<form:form method="post" action="trillTerning">
            	
            		<c:if test="${not empty hvemSinTur}">
            			<p style="color:blue">Det er ${hvemSinTur} sin tur:</p>
            		</c:if>
                	<c:if test="${empty terningkast}">
                		<button type="submit">Trill terning</button>
                	</c:if>
            	
        	</form:form>
    	</div>
    	<div class="terningkast">
    		<form:form method="post" action="flyttBrikke">
    			<c:if test="${not empty spesiellrute}">
    				<p>Oi! Du havnet på rute ${spesiellrute} som er en ${flyttet < 0 ? 'slange':'stige'} og du ble flyttet ${flyttet} tilbake</p>
    			</c:if>
    			
    			<c:if test="${not empty terningkast}">
    				<p>Du trillet: ${terningkast}</p>
    				<button type="submit">Flytt spiller</button>
    			</c:if>
    		</form:form>
    	</div>
    	</fieldset>
    </div>
</body>
</html>

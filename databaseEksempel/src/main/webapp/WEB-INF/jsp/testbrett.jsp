<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <%-- You can use Java code to dynamically populate the board with cells if needed --%>
        <%-- For simplicity, the cells are manually created here --%>
        <%-- Add classes like player1 or player2 to represent different states on the board --%>
        <c:forEach var="rute" items="${ruteliste}">
        	<div style="color:${rute.verdi < 0 ? 'red' : '' || rute.verdi > 0 ? 'green' : ''}" class="cell">${rute.rutenummer}</div>
        </c:forEach>
        <%-- Repeat the above cell div for the total number of cells (100 in this case) --%>
        <%-- You can use a loop or other methods to generate these cells dynamically --%>
    </div>
</body>
</html>

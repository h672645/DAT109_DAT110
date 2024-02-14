<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
     
   
    <div style="text-align: center;">
        <h2>Reservasjonsside</h2>
        
        <form action="reservasjon" method="post">
            <label><input type="checkbox" name="kategori" value="sedan"> Sedan</label><br>
            <label><input type="checkbox" name="kategori" value="sport"> Sport</label><br>
            <label><input type="checkbox" name="kategori" value="suv"> SUV</label><br>
            <label><input type="checkbox" name="kategori" value="familie">Familie</label><br><br>
            <input type="submit" value="Reserver">
        </form><br><br>
          

        <h2>  levering!</h2>
        <form  action="levering" method="get"> 
       REGISTERINGSNUMMER <input type="text" name="levering" ><br>
           UTLEIEkONTOR       <input  type="text" name="UTLEIEkONTOR"> <br><br>
    

         <input  type="button" value="lever bilen">


        </form>
    </div>
   
</body>
</html>
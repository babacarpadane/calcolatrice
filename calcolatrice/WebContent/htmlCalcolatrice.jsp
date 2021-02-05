<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>la mia prima web app</title>
</head>
<body>
   <h1>Questa è una calcolatrice</h1>
   
   <form method="Get">
   Inserisci il primo numero: <input type="text" name="num_uno" size="20px"> <br>
   Inserisci il secondo numero: <input type="text" name="num_due" size="20px"><br>
   <input type="submit" name="add" value="+" formaction="Somma"> 
   <input type="submit" name="minus" value="-" formaction="Sottrazione"> 
   <input type="submit" name="mult" value="*" formaction="Moltiplicazione">  
   <input type="submit" name="div" value="/" formaction="Divisione">
   </form> 
   
      
   
   <br>Risultato ${result}
</body>                                         
</html>
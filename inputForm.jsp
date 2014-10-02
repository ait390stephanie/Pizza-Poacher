<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pizza Poacher Home Page</title>
		<link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>
	</head>
	
	<body><!-- Form to collect pizza info -->
		<h1>Pizza Poachers- Serving all pizza needs</h1>
		<form action="pizza.PizzaPoacherServlet" method="post">
			<h3>This program is currently only available in the Fairfax Virginia (22031) area</h3>
			<h4>Please fill out the fields below:</h4>
			<h4>Address:</h4>
			Street Address: <input type="text" name="address" size="40" />
			<br />Apt/Suite No.: <input type="text" name="suite" />
			<h4>Pizza Customization</h4>
			Size <select name="size">
				<option value="sm">Small</option>
				<option value="m">Medium</option>
				<option value="l">Large</option>
				</select>
			<br />Toppings <select name="size">
				<option value="cheese">Cheese</option>
				<option value="ex cheese">Extra Cheese</option>
				<option value="meat">Meat</option>
				<option value="half">Half Meat/Half Cheese</option>
				</select>
			<h4>Advanced Options</h4>
			Pizza Type <select name="size">
				<option value= "blank">None</option>
				<option value="surprise">Surprise Me</option>
				<option value="special">Specialty</option>
				<option value="cheap">Wallet Friendly</option>
				<option value="latenight">Late Night (Deliver past 11 PM.)</option>
				</select>
			<br />Distance <select name="size">
				<h4>The pizza restaurants are within a 15 miles radius of Fairfax</h4>
				<option value= "blank">None</option>
				<option value="5m">5 Miles</option>
				<option value="10m">10 Miles</option>
				<option value="15m">15 Miles</option>
				</select>				
			<br /><br />
			<input type="submit" value="Find my pizza!"/>
		</form>
		
		<hr>
		<h5>Contact Us:</h5>
		<p>Email: pizzapoachers@yum.com
		<br />Phone Number: 123-456-7890
		<br />Address: 4404 University Blvd, Fairfax VA 22030</p>
	</body>
</html>

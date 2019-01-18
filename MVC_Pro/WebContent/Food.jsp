<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food MVC</title>

</head>
<body background="f4.jpg">

</body>
</head>

<h1 align="center">
	<fieldset>
		<font color="red"><i>Welcome To Food Express:</font>
		<i>Remove Your Hunger </i>
	</fieldset>
</h1>
<form action="Food.do" method="POST" name="Food">
	<table align="center">


		<tr>
			<td><fieldset>
					<legend>Food Type : </legend>
					<input type="radio" name="foodType" value=veg />Veg <input
						type="radio" name="foodType" value=Non-veg>Non-veg</input>
				</fieldset>
		</tr>

		</td>


		<tr>
			<td><label><fieldset>
						Food Item : <input type="text" placeholder="  Enter your FoodName"
							name="foodName" /></label>
				</fieldset></td>

		</tr>
		<tr>
			<td><fieldset>
					Location: <input type="text" placeholder="Delivery Location"
						name="location" />
				</fieldset></td>
		</tr>
		<tr>
			<td><fieldset>
					Food Quantity : <select name="quantity">
					<option value="1">Choose QTY</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
				</fieldset> </select></td>
		</tr>

		<tr>
			<td>PaymentMode : <select name="paymentMode">
					<option value="ChooseYourPaymentMODE">ChooseYourPaymentMODE</option>
					<option value="COD">COD</option>
					<option value="Paytm">Paytm</option>
					<option value="Card">Card</option>
					<option value="OnlineTransfer">OnlineTransfer</option>
					<option value="OtherMode">OtherMode</option>
					</fieldset>
			</select></td>
		</tr>
		<tr>
			<td><fieldset>
					<input type="reset" value="Clear" name="clear" />
					 <input
						type="submit" value="Click" name="click" /> </input>
				</fieldset></td>
		</tr>
	</table>
</form>

 <h5>Food item:${FoodName} selected Delivered on location
	${Location}</h5>
 
<body>

</body>
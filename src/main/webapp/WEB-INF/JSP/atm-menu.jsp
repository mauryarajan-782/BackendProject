<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ATM Menu</title>
</head>

<body>

    <h1>ATM Management System</h1>

    <h2>ATM Menu</h2>

    <form action="balance" method="get">
    <button type="submit">Check Balance</button>
	</form>
    <br><br>

    <form action="deposit" method="get">
    <button type="submit">Deposit Money</button>
	</form>
    <br><br>

    <form action="withdraw" method="get">
    <button type="submit">Withdraw Money</button>
	</form>
    <br><br>

    <form action="statement" method="get">
    <button type="submit">Mini Statement</button>
	</form>
    <br><br>

    <form action="changePin" method="get">
    <button type="submit">Change PIN</button>
	</form>
    <br><br>

    <form action="exit" method="get">
    <button type="submit">Exit</button>
	</form>

</body>
</html>
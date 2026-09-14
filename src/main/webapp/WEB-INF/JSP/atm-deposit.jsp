<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Deposit Money</title>
</head>

<body>

    <h1>ATM Management System</h1>

    <h2>Deposit Money</h2>

    <form action="depositMoney" method="post">

        <label>Enter Amount:</label>
        <input type="number" name="amount">

        <br><br>

        <button type="submit">Deposit</button>

    </form>

</body>
</html>
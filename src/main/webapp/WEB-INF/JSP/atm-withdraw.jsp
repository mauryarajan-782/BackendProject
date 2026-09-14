<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Withdraw Money</title>
</head>

<body>

    <h1>ATM Management System</h1>

    <h2>Withdraw Money</h2>

    <form action="withdrawMoney" method="post">

        <label>Enter Amount:</label>
        <input type="number" name="amount">

        <br><br>

        <button type="submit">Withdraw</button>

    </form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change PIN</title>
</head>

<body>

    <h1>ATM Management System</h1>

    <h2>Change PIN</h2>

    <form action="changePinProcess" method="post">

        <label>Enter Current PIN:</label>
        <input type="number" name="oldPin">

        <br><br>

        <label>Enter New PIN:</label>
        <input type="number" name="newPin">

        <br><br>

        <button type="submit">Change PIN</button>

    </form>

</body>
</html>
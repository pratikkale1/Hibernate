<%-- 
    Document   : Register
    Created on : 07-Jul-2023, 3:28:31 PM
    Author     : CDAC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Student Registration</h1>
        <form method="post" action="../Registration">
            Name: <input type="text" id="studentname" name="sname"><br>
            EmailID: <input type="email" id="emailid" name="emailid"><br>
            Mobile: <input type="text" id="mobile" name="mobile"><br>
            <input type="submit" name="submit" value="Register">            
        </form>
    </body>
</html>

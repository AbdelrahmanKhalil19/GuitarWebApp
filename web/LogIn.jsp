<%-- 
    Document   : LogIn
    Created on : Dec 19, 2022, 6:10:25 AM
    Author     : compu zone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="LogInStyle.css" >
    <title>Login Form</title>
    </head>
    <body>
    <div class="container">
  <form action="LoginController" method="get">
    <div class="row">
      <h2 style="text-align:center">Login Manually</h2>      
      </div>
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login" >
      </div>

    </div>
  </form>
</div>

<div class="bottom-container">
  <div class="row">
    <div class="col">
      <a href="#" style="color:white" class="btn">Sign up</a>
    </div>
    <div class="col">
      <a href="#" style="color:white" class="btn">Forgot password?</a>
    </div>
  </div>
</div>
</body>           
</html>

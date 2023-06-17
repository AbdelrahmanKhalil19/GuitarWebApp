<%-- 
    Document   : SignUp
    Created on : Dec 19, 2022, 5:59:47 AM
    Author     : compu zone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="LogInStyle.css" >
    <title>Register Form</title>
    </head>
    <body>
    <div class="container">
  <form action="SignUpController" method = "post" >
    <div class="row">
      <h2 style="text-align:center">Register Manually</h2>      
      </div>
        <input type="text" name="Username" placeholder="Username" required>
        <input type="password" name="Password" placeholder="Password" required>
        <input type="submit" value="Register" >
      </div>

    </div>
  </form>
</div>

<div class="bottom-container">
  <div class="row">
    <div class="col">
      <a href="#" style="color:white" class="btn">Sign in </a>
    </div>
    <div class="col">
      <a href="#" style="color:white" class="btn">Forgot password ?</a>
    </div>
  </div>
</div>
</body>           
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bags Hub</title>
</head>
<center>
<body>
<title>Bags Hub</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
   <a class="navbar-brand" href="/shoeclue">BagsHub</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/shoeclue">Home</a></li>
      <li><a href="CustomerCheck">Login</a></li>
      <li><a href="customerSignUp">Sign Up</a></li>
        </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="aboutUs"><span class="glyphicon glyphicon-user"></span>Aboutus</a></li>
      <li><a href="service"><span class="glyphicon glyphicon-log-in"></span>Services</a></li>
    </ul>
  </div>
</nav></body>
<h1>Thanks for shopping with us</h1>
   <form action="${flowExecutionUrl}" method="post">
<!--  <input type="submit" name="_eventId_goToAddress" value="Next">-->
<input type="submit"  name="_eventId_goToConfirmation" value="Next"/>
<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
<button class="btn btn-danger" name="_eventId_cancel">Cancel</button>
</form>

</center>
</html>
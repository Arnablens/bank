<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<style>
body{
 background: url(https://i.pinimg.com/474x/4d/92/e9/4d92e9aa0548758f98a0bd97443f3d15--country-girls-country-roads.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
 .error {
      color: red;
      
   }
header {
text-align: center;
}
</style>
<title  class="text-primary">Link bank & User</title>
       <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js" integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
        crossorigin="anonymous"></script>
</head>
<body>
  <h1 style="text-align:center;"  class="text-primary">Link Bank & User</h1>
  <hr>
  <div class="container">
    <form action="/link" method="post">
      <div class="form-group">
     <h3> <label for="bankId"  class="text-primary">Bank:</label></h3>
      <select class="form-control" id="bankId" name="bankId">
             <option selected="selected">Select</option>
        <c:forEach items="${banks}" var="bank">
            <option value="${bank.getBankId()}">${bank.getBankName()}</option>
             
        </c:forEach>
      </select>
      </div>
      <br><br>
      <div class="form-group">
     <h3> <label for="userId"  class="text-primary">User:</label></h3>
      <select class="form-control" id="userId" name="userId">
             <option selected="selected">Select</option>
        <c:forEach items="${users}" var="user">
            <option value="${user.getUserId()}">${user.getUserName()}</option>
             
        </c:forEach>
      </select>
      </div>
      <br><br>
     
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Link</button>
    </form>
  </div>
     
  
</body>
</html>
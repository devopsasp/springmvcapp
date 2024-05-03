<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
  Item Orders
</h1>

<form method="post" action="itemorder">
 Enter Date <br/>
 <input type='text' name='orderdate'/><br/>
 Enter Elements to be ordered<br/>
   <input type='text' name='item1'/><br/>
   <input type='text' name='item2'/><br/>
   <input type='text' name='item3'/><br/>
  Enter Store Name
    <input type='text' name='storeName'/><br/>
    Enter Location 
      <input type='text' name='location'/><br/>
      <input type='submit' value='save'/><br/> 
   
</form>
</body>
</html>
<html>
<body>
Keep the page ideal for 30 seconds
	<br> And try reloading the page
	<br> you will be redirected to home page automatically
	<br>
	<%
		if(session != null){
			if(session.getAttribute("user") != null){
				String name=(String)session.getAttribute("user");
				out.print("Hello" +name+ "Welcome to ur profile");
			}else{
				response.sendRedirect("login1.html");
			}
		}
	%>
	</br>
	</br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout" style="background-color: threedhighlight;">
	</form>
</body>
</html>

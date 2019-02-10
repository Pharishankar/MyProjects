<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.2.min.js">
</script>
<script>
	$(document).ready(function(){
		
		//alert('Jquery is Ready and Integrated');
		$("#id_get_time").click(function(){
			//alert("button click");
			$.ajax({
				url:'get_time',
				success: function(data){
					$("#id_time").html(data);
				}
			});
		});	
	});
</script>
</head>
<body>
<h1>Ajax Test Page</h1>
	<button id="id_get_time">Get Server Time</button><br>
	<p id="id_time"></p>
</body>
</html>
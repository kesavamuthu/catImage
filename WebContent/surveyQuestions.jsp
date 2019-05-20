<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Survey</title>
<link rel="stylesheet" href="css/survey.css">
</head>
<body style="background-color: #ffe6e6">
	<div class="outer">
		<form method="get" action="clDataCollector.jsp">
			<div class="checkbox-wrapper"
				onclick="crazyCheck('.checkbox-wrapper .chb')">
				<img src="img/download (1).jpg" alt="cat"> <label><input
					type="checkbox" name="first" class="chb" value="one" /> CheckBox1</label> <label><input
					type="checkbox" name="second" class="chb" value="two" /> CheckBox2</label> <label><input
					type="checkbox" name="third" class="chb" value="three">
					CheckBox3</label>
			</div>
			<div class="checkbox-wrapper1"
				onclick="crazyCheck('.checkbox-wrapper1 .chb')">
				<img src="img/download.jpg" alt="cat"> <label><input
					type="checkbox" name="first" class="chb" value="one" /> CheckBox1</label> <label><input
					type="checkbox" name="second" class="chb" value="two" /> CheckBox2</label> <label><input
					type="checkbox" name="third" class="chb" value="three">
					CheckBox3</label>
			</div>
			<div class="checkbox-wrapper2"
				onclick="crazyCheck('.checkbox-wrapper2 .chb')">
				<img src="img/images.jpg" alt="cat"> <label><input
					type="checkbox" name="first" class="chb" value="one" /> CheckBox1</label> <label><input
					type="checkbox" name="second" class="chb" value="two" /> CheckBox2</label> <label><input
					type="checkbox" name="third" class="chb" value="three">
					CheckBox3</label>
			</div>
			<div class="checkbox-wrapper3"
				onclick="crazyCheck('.checkbox-wrapper3 .chb')">
				<img src="img/images.jpg" alt="cat"> <label><input
					type="checkbox" name="first" class="chb" value="one" /> CheckBox1</label> <label><input
					type="checkbox" name="second" class="chb" value="two" /> CheckBox2</label> <label><input
					type="checkbox" name="third" class="chb" value="three">
					CheckBox3</label>
			</div>
			<div class="checkbox-wrapper4"
				onclick="crazyCheck('.checkbox-wrapper4 .chb')">
				<img src="img/images.jpg" alt="cat"> <label><input
					type="checkbox" name="first" class="chb" value="one" /> CheckBox1</label> <label><input
					type="checkbox" name="second" class="chb" value="two" /> CheckBox2</label> <label><input
					type="checkbox" name="third" class="chb" value="three">
					CheckBox3</label>
			</div>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-1.12.4.js"
		integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/radioLikeCheckbox.js">
		
	</script>
	<script>
		function close() {
			window.close();
		}
	</script>
</body>

</html>
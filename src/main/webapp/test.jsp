<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="js/ajax.js"></script>
	<script type="text/javascript">
		function check_adminCode(){
			//获取xhr对象
			var xhr = getXhr();
			//发送请求
			xhr.open('get','check_admin.do?adminCode='+$F('adminCode'),true);
			
			xhr.onreadystatechange = function(){
				if (xhr.readyState == 4 && xhr.status == 200) {
					var txt = xhr.responseText;

					$('adminCode_msg').innerHTML = txt;
				} 
			};
			
			xhr.send(null);
		}
		
		
	</script>
</head>
<body>
	<form action="" method="post">
		账号：<input id="adminCode" name="adminCode" onblur="check_adminCode();">
		<span id="adminCode_msg"></span>
		<br>
		密码：<input type="password" name="pwd"><br>
		<input type="submit" value="确定">
	</form>
</body>
</html>
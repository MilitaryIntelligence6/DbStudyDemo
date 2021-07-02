<%--
  Created by IntelliJ IDEA.
  User: LX
  Date: 2019/12/11
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <link href="../static/css/login.css" type="text/css" rel="stylesheet" />
    <title>登录</title>
</head>
<body>
<!--<div class="show-login">
    <i class="f"></i>Show Login Form
</div>-->
<div class="login-box">
    <h1>WELCOME</h1>
    <!--表单-->
    <h2>用户名：lx</h2>
    <h2>密码：123456</h2>
    <form class="login-form" action="/log" method="post">
        <input class="txtbox" type="text" name="username"  placeholder="用户名"/>
        <input class="txtbox" type="password" name="password"  placeholder="密码"/>
        <input class="login-button" type="submit"  value="登录"/>
    </form>
</div>

</body>
</html>

<%@page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<html>
<head>
</head>
<body>
    <form action="${pageContext.request.contentType}/register" method="post">
        用户名<input type="text" name="user.username"/><br/>
        密码<input type="password" name="user.password"/><br/>
        年龄<input type="text" name="user.age"/><br/>
        <input type="submit" value="注册"/>

    </form>
</body>
</html>
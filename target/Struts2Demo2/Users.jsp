<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/18
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>青鸟租房</title>
</head>
<body>
<div>
    <table>
        <tr>
            <td>用户名</td>
            <td>密码</td>
        </tr>

        <s:iterator value="list" >
            <tr>
                <td><s:property value="userName"/></td>
                <td><s:property value="password"/></td>
            </tr>
        </s:iterator>
    </table>
</div>

<div>
    <form action="register.action" method="get">
        <table border="1">
            <tr>
                <td>注册新用户</td>
            </tr>
            <tr>
                <td>用户名:<s:textfield name="users.userName"/></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码:<s:textfield name="users.password"/></td>
            </tr>
            <tr>
                <td>ID:<s:textfield name="users.id"/></td>
                <td>Name:<s:textfield name="users.name"/></td>
                <td>TalePhone:<s:textfield name="users.telePhone"/></td>
                <td>isAdmin:<s:textfield name="usrs.isAdmin"/></td>
            </tr>
            <tr><td><s:submit value="提交"/></td></tr>
        </table>
    </form>
</div>

</body>
</html>

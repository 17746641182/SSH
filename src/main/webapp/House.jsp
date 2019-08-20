<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/18
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>租房系统</title>
</head>
<body>

<div style="background-color: azure;width: 500px;height: 400px;border: 1px solid red">
    <p>
        <s:fielderror fieldName="name"/>

        <s:fielderror fieldName="pwd"/>
    </p>
    <s:form action="House" method="POST">
        <p>用户名:<s:textfield name="users.userName"/></p>
        <p>密 码:<s:password name="users.password"/></p>
        <s:submit value="立即登录"/>
    </s:form>
</div>



</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/17
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<div>
    <s:fielderror/> <%--输出校验信息--%>
</div>
<p>-----------------------------------</p>

<s:form action="login" method="POST">
    <div>用户名:<s:textfield name="user.userName"/></div>
    <div>密&nbsp;&nbsp;码<s:password name="user.password"/></div>
    <div><s:submit value="登录"/></div>
</s:form>
</body>
</html>

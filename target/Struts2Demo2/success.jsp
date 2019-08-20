<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/17
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>登录成功</h1>

<p>欢迎您,<s:property value="user.userName"/></p>
<h1>读取Session中保存的用户名</h1>
<p>欢迎你,${sessionScope.CURRENT_USER}!</p>
<p>密码:,${pwd}</p>

<p>使用iterator标签遍历集合:</p>

<p>
    <s:iterator value="list" id="name">
        <s:property value="name"/><br/>
    </s:iterator>
</p>
----------------------------------------
<p>
    租房系统
    用户名:${sessionScope.userName}
    用户密码:${sessionScope.password};
    登录成功!
</p>


</body>
</html>

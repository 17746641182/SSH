<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/16
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<div>
    <h1>
        <%--显示Struts Action中message的属性内容--%>
        <s:property value="message"/>
    </h1>
</div>
<div>
    <form action="helloWorld.action" method="post">
        请输入您的姓名:
        <input name="name" type="text">
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:include page="helloWorld.jsp"/>--%>
<%--<%@ page isELIgnored="false"%>--%>
<html>
<body>
<h2>Hello World!</h2>
    <form action="login.action" method="post">
        <h1>用户登录</h1>
        <p>用户名:<input type="text" name="user.userName"/> </p>
        <p>密码:<input type="password" name="user.password"/></p>
        <p><input type="submit" value="提交"></p>
    </form>

    <a href="login.jsp">登录界面</a>
    <a href="Iter.action">访问遍历iterator标签遍历集合</a>
    <a href="House.jsp">租房系统</a>

    <a href="UserList.action">青鸟租房</a>

    <s:form action="test_page1" method="get">
        <s:submit value="测试页面1"/>
    </s:form>

    <s:form action="test_page2" method="GET">
        <s:submit value="测试页面2"/>
    </s:form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 25564
  Date: 2017/9/14
  Time: 7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>三种注释实例</title>
</head>
<body>
    <h3>首先是演示隐藏注释功能，在JSP页面中的隐藏注释不会发布到客户端</h3>
    <hr>
    <%--这一行在发布网页时不会被看到--%>
    <hr>

    <h3>HTML注释，在JSP页面中的HTML注释会在客户端源文件中看到，但不会发布到页面上</h3>
    <hr>
    <!--这一行注释在发布网页中不会被看到，在源文件中可以看到<%=new java.util.Date()%>-->
    <hr>

    <h3>java注释，在JSP页面中的java注释不会发布到客户端上</h3>
    <hr>
    <%//这一行注释在发布网页时不会被看到，在源文件中也不会看到%>
    <hr>

</body>
</html>

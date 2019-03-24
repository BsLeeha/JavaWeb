<%--
  Created by IntelliJ IDEA.
  User: BsLee
  Date: 2019/3/24
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Trapezoid </title>
  </head>
  <body>

  <form action="trapezoidAreaComputeServlet" method="get">
    梯形：
    <br> 输入上底：<input type="text" name="topLine" size="4">
    <br> 输入下底：<input type="text" name="baseLine" size="4">
    <br> 输入高：<input type="text" name="height" size="4">
    <input type="submit" value="submit" />
  </form>

  </body>
</html>

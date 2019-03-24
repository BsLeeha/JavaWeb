<%--
  Created by IntelliJ IDEA.
  User: BsLee
  Date: 2019/3/24
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="trapezoidBean" type="beans.TrapezoidBean" scope="session" />

<html>
<head>
    <title> trapezoid Compute  </title>
</head>
<body>

    <jsp:getProperty name="trapezoidBean" property="message" />
    上底：<jsp:getProperty name="trapezoidBean" property="topLine" />
    下底：<jsp:getProperty name="trapezoidBean" property="baseLine" />
    高：<jsp:getProperty name="trapezoidBean" property="height" />
    面积：<jsp:getProperty name="trapezoidBean" property="area" />

</body>
</html>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: d.evgenov
  Date: 03.10.2018
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Happy java application</title>
  </head>
  <body>
  <jsp:include page="header.jsp" />
  <p>Welcome to the CRUDE application.</p>
  <%
    java.util.Date date = new java.util.Date();
    out.println("Today is :" + date + "\n");
  %>

  <br>
  <jsp:include page="footer.jsp" />
  </body>
</html>
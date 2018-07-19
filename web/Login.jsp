<%-- 
    Document   : Login
    Created on : 25/12/2016, 04:32:04 PM
    Author     : smarv
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-5"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-5">
        <title>JSP Page</title>
    </head>
    <body>
    <html:html>
        <h1 class="titulo">Ingreso al Sistema</h1>
    </html:html>
    <html:form action="/Login">
        <table border="1" class="datos_form">
            <tr><td>Usuario</td> <td><html:text property="usuario" styleClass="datos_form"></html:text></td></tr>
            <html:errors property="usuario"></html:errors><br>
            <tr><td>Calve</td> <td><html:password property="password" styleClass="datos_form"></html:password></td></tr>
            <html:errors property="password"></html:errors><br>
            <html:errors property="Invalido"></html:errors><br>
        </table>
        <html:submit value="Confirmar" styleClass="boton"></html:submit>
    </html:form>
</body>
</html>

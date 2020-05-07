<%-- 
    Document   : login
    Created on : 8/04/2020, 03:51:36 PM
    Author     : Johan
--%>

<%@page import="Default.RedSocialDTO"%>
<%@page import="Default.RedSocialDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%

            String cod = (String) request.getParameter("codigo");
            String pass = (String) request.getParameter("pass");

            if (cod.isEmpty() || pass.isEmpty()) {
                response.sendRedirect("index.html?" + "ErrorDeLogin");
            } else {
                Integer codigo = Integer.parseInt(cod);
                RedSocialDAO r = new RedSocialDAO();
                RedSocialDTO u = new RedSocialDTO();

                u = r.buscarUsuario(codigo);

                if (pass.equals(u.getContrasena())) {
                    response.sendRedirect("inicio.html?" + cod);
                }
            }
        %>


    </head>
</html>

<%-- 
    Document   : Saved_data
    Created on : Dec 12, 2022, 12:54:54 AM
    Author     : compu zone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>Products</h1>
        <%
            String pname = request.getParameter("name");
            String IDp = request.getParameter("ID");
            String category = request.getParameter("Category");
            String descripton = request.getParameter("Description");
            String price = request.getParameter("price");
        %>
        <table border="1">
            <tbody>
                <tr>
                    <td>Product name :</td>
                    <td><%= pname %></td>
                </tr>
                <tr>
                    <td>Product ID :</td>
                    <td><%= IDp %></td>
                </tr>
                <tr>
                    <td>Description :</td>
                    <td><%= descripton %></td>
                </tr>
                <tr>
                    <td>Category :</td>
                    <td><%= category %></td>
                </tr>
                <tr>
                    <td>Price :</td>
                    <td><%= price %></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>

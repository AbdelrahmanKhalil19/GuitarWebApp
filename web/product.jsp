<%-- 
    Document   : product
    Created on : Dec 10, 2022, 7:00:42 PM
    Author     : abdelrahman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>products</h1>
        <form action="Pcontroller" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Product name :</td>
                        <td><input type="text" name="name" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Product ID :</td>
                        <td><input type="text" name="ID" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Description :</td>
                        <td><input type="text" name="Description" value="" size="50" /></td>
                    </tr>
                    <tr>
                        
                        
                      <td>Category :</td>
                        <td><select name="Category">
                                <option>Electric guitars</option>
                                <option>Acoustic guitars</option>
                                <option>Bass</option>
                                <option>Amplifiers</option>
                                <option>Studio Equipment</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Price :</td>
                        <td><input type="text" name="price" value="" size="50" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="submit"  />
        </form>
    </body>
</html>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="adminStyle.css" type="text/css">
        <title>Admin Stock Page</title>
    </head>
    <body>
        <ul>
            <li><a href="AdminView.jsp">Home</a></li>
            <li id="Checked"><a href="stockView.jsp">Check Stock Size</a></li>
            <li><a href="product.jsp">Add product</j></li>
        </ul>
    <Center>
        <table border="1">
            <tr><th>Product ID</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Product Category</th>
                <th>Product Price</th>
        <%
            try{
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/goods","abdo","123");
            Statement st = con.createStatement();
            String str = "SELECT * FROM UNTITLED";
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                
            
            %>
            <tr>
                <td><%=rs.getString("PNAME")%></td>
                <td><%=rs.getString("PID")%></td>
                <td><%=rs.getString("DESCRIPTION")%></td>
                <td><%=rs.getString("CATEGORY")%></td>
                <td><%=rs.getString("PRICE")%></td>
            </tr>
            <%}
            }catch(Exception e){
                
            }
            
            %>
        </table>
    </Center>
    </body>
</html>
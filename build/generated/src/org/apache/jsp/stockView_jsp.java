package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class stockView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminStyle.css\" type=\"text/css\">\n");
      out.write("        <title>Admin Stock Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"AdminView.jsp\">Home</a></li>\n");
      out.write("            <li id=\"Checked\"><a href=\"stockView.jsp\">Check Stock Size</a></li>\n");
      out.write("            <li><a href=\"product.jsp\">Add product</j></li>\n");
      out.write("        </ul>\n");
      out.write("    <Center>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr><th>Product ID</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Product Description</th>\n");
      out.write("                <th>Product Category</th>\n");
      out.write("                <th>Product Price</th>\n");
      out.write("        ");

            try{
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/goods","abdo","123");
            Statement st = con.createStatement();
            String str = "SELECT * FROM UNTITLED";
            ResultSet rs = st.executeQuery(str);
            while(rs.next()){
                
            
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("PNAME"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("PID"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("DESCRIPTION"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("CATEGORY"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("PRICE"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
            }catch(Exception e){
                
            }
            
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </Center>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

import javax.servlet.*;
import javax.io.*;
public class FirstServlet implements Servlet
{
	public void init(ServletConfig config) throws ServletException;
	{
		System.out.println("init method called");
	}
	public void service(ServletRequest req,ServletResponse res) throws ServletException,ServletIOException;
	{
		System.out.println("service method is called");
	}
	public void destroy( )
	{
		System.out.prinltn("destroy method is called");
	}
	public ServletConfig getServletConfig( )
	{
		return null;
	}
	public String getServletInfo( )
	{
		return " "
	}
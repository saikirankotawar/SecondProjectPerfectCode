import javax.servlet.*;
import java.io.*;
public class SaiKiran implements Servlet
{
    public void init (ServletConfig config) throws ServletException
	{
		System.out.println("init method called");
	}
	public void service(ServletRequest reg,ServletResponse res) throws IOException,ServletException
	{
		System.out.println("Service method called");
	}
	public void destroy( )
	{
		System.out.println("Destroy method called");
	}
	public ServletConfig getServletConfig( )
	{
		   return null;
	}
	public String getServletInfo( )
	{
		return " ";
	}
}


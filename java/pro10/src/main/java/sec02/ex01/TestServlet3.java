package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("*.do")
public class TestServlet3 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String context = request.getContextPath();
		String url = request.getRequestURL().toString();
		String mapping = request.getServletPath();
		String uri = request.getRequestURI();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<title>TestServlet3입니다</title>");
		out.print("<head>");
		out.print("<body bgcolor='red'>");
		out.print("<b>TestServlet3입니다</b><br>");
		out.print("<b>컨테스트명: " + context + "</b><br>");
		out.print("<b>전체경로: " + url + "</b><br>");
		out.print("<b>매핑명: " + mapping + "</b><br>");
		out.print("<b>URI: " + uri + "</b><br>");
		out.print("</body>");
		out.print("</html>");
	}

}

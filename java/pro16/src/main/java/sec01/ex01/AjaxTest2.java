package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTest1
 */
@WebServlet("/ajaxTest2")
public class AjaxTest2 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String result = "";
		PrintWriter writer = response.getWriter();
		result = "<main><book>" +
		"<title><![CDATA[초보자를 위한 자바 프로그래밍]]></title>" +
		"<writer><![CDATA[인포북스 저 | 이병승]]></writer>" +
		"<image><![CDATA http://localhost:8080/pro16/image/사진.jpeg]></image>" +
		"</book>" +
		"<book>" +
		"<title><![CDATA[모두의 파이썬]]></title>" +
		"<title><![CDATA[길벗 저 | 이승찬]]></title>" +
		"<title><![CDATA [http://localhost:8080/pro16/image/사진2.jpeg]]></title>" +
		"</book></main>";
		System.out.println(result);
		writer.print(result);
				
	}
}

package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.scope.TestApplcationScope;
import tw.com.scope.TestRequestScope;
import tw.com.scope.TestSessionScope;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private TestRequestScope requestScope;
	@Inject
	private TestSessionScope sessionScope;
	@Inject
	private TestApplcationScope appScope;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println(requestScope.getName());
		out.println(sessionScope.getName());
		appScope.addCount();
		out.println(appScope.getCount());
		Enumeration<String> enumer = request.getAttributeNames();
		while(enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

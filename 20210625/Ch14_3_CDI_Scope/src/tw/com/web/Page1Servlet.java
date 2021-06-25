package tw.com.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.scope.TestRequestScope;
import tw.com.scope.TestSessionScope;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
    private TestRequestScope requestScope;
	@Inject
	private TestSessionScope sessionScope;
    public Page1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		requestScope.setName("requestScope");
		sessionScope.setName("sessionScope");
		request.getRequestDispatcher("/page2").
		forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

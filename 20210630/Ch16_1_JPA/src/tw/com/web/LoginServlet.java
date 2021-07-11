package tw.com.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@EJB	
	private MyUserBeanLocal myUserBean;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		MyUser user = new MyUser();
		user.setAccount("ken");
		user.setPassword("123456");
		boolean createUser = myUserBean.crearUser(user);
		System.out.println(createUser);
		
		MyUser loginUser =  myUserBean.findMyUser("ken", "123456");
		if (loginUser != null) {
			System.out.println("Pass!");
		}else {
			System.out.println("fail!");
		}
		//em.persist(user);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

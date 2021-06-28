package tw.com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.db.MyUserTable;
import tw.com.db.User;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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
			//MyUserTable.createUser("Ken", "123456");		
			User user = MyUserTable.loging("Ken", "xxxx");
			HttpSession session = request.getSession();
			if (user!= null) {
				session.setAttribute("user", user);
				System.out.println("user:"+user);	
			}else {
				session.removeAttribute("user");
				System.out.println("Fail!!");
			}
			
			response.sendRedirect("login_msg.jsp");
			
//		String url="jdbc:mysql://localhost:3306/20210628db?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//		String user="root";
//		String password="123456";
//		try(Connection con=DriverManager.getConnection(url, user, password)){
//			
//		}catch (SQLException ex) {
//			System.out.println(ex);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

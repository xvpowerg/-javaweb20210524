package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginJson")
public class LoginJsonServlet extends HttpServlet {
	
	//假設帳號是 qwer 密碼:12345
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String defAccount = "qwer";
		String defPassword = "12345";		
		String account = req.getParameter("account");
		String password =req.getParameter("password");
		String json = "{\"msg\":\"%s\",\"isLogin\":%b,\"location\":\"%s\"}";		
		String msg  = "";
		boolean isLogin = false;
		String location = "";
		//設定格式為JSON
		resp.setContentType("application/json");
		//語系是UTF-8
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		if (defAccount.equals(account) && 
				defPassword.equals(password)) {
			//msg 
			//isLogin
			//location
			msg = "登入成功";	
			isLogin = true;
			location = "user.html";
		}else {
			msg ="登入失敗";
		
		}
		json = String.format(json, msg,isLogin,location);
		
		out.println(json);

	}
}

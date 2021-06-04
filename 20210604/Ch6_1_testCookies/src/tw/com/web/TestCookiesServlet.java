package tw.com.web;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/testCookies")
public class TestCookiesServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		//預設情況下Cookie 瀏覽器關閉就結束
		resp.getWriter().println("Test Cookies!");
		Random random = new Random (); 
		Cookie c1 = new Cookie("loginTime",LocalDateTime.now().toString()); 
		Cookie c2 = new Cookie("id",random.nextInt(50000)+"");
		//單位是秒 案例是3分鐘
		c2.setMaxAge(60*3);
		//預設情況瀏覽器關閉Cookie就結束
		//c2.setMaxAge(-1);
		//刪除cookie
		//c2.setMaxAge(0);
		resp.addCookie(c1);
		resp.addCookie(c2);
	}
}

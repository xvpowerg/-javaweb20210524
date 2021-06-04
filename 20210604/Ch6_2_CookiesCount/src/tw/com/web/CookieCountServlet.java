package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/count")
public class CookieCountServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   int count = 0;	
		   PrintWriter out = resp.getWriter();
		   Cookie[] cookieArray =   req.getCookies();
		   if (cookieArray != null) {
			  Optional<Cookie> option =  Stream.of(cookieArray).
			   filter(c->c.getName().equals("count")).
			   findFirst();
				  if(option.isPresent()) {
					  String value = option.get().getValue();
					  count = Integer.parseInt(value);
				  }
			   }
		   
		   	//Cookie 的name是不會重複的
		   count++;
		   Cookie countCookie  = new Cookie("count",count+"");
		   //一天時間
		   countCookie.setMaxAge(60*60*24);
		   resp.addCookie(countCookie);
		   out.println("Count:"+count);
		
		
		
	}
}

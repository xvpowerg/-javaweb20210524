package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookies")
public class TestReadCookiesServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =   resp.getWriter();
		Cookie[]  cookieArray = req.getCookies();
		if (cookieArray != null) {
			Stream.of(cookieArray).
			forEach(ck->out.println(ck.getName()+":"+ck.getValue()));			
		}
		
	}
}

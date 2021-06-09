package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tw.com.bean.Item;
import tw.com.web.app.WebTools;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				HttpSession session = req.getSession();
				String[] itemsId =   req.getParameterValues("itemsId");
				List<Item> itemList = Item.getItem(itemsId);		
				WebTools.setItemListBySession(session,itemList);
				resp.sendRedirect("index.html");
				
		}
}

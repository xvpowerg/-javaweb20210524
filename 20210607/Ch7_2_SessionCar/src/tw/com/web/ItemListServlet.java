package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tw.com.bean.Item;
import tw.com.web.app.WebTools;

@WebServlet("/itemList")
public class ItemListServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				HttpSession session = req.getSession(false);
				resp.setContentType("text/html;charset=UTF-8");
				PrintWriter out = resp.getWriter();
				if (session==null) {					
					out.println("無產品");
					return;
				}
				List<Item> itemList = 
						WebTools.getItemListBySession(session);
				String htmlList = "<ul>%s</ul>"
						+ "<a href='index.html'>返回首頁</a>";
				String liStr="";
				for (Item it : itemList) {
					liStr+="<li>"+it.getName()+"</li>";
				}
				out.print(String.format(htmlList, liStr));
				//System.out.println(itemList);			
		}
}

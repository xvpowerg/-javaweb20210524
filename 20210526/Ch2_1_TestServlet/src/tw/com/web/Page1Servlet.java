package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
//1 某個類別 先繼承 HttpServlet 變為Servlet
//2 將此類別登記到容器內
	//登記方式有2
	//1 使用(WebServlet)注釋 簡單 彈性小
	//2 使用web.xml 麻煩 彈性大
	//HttpServletRequest input 可用來接收 客戶端傳送的訊息 
	//HttpServletResponse output 回應客戶端的資訊
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws IOException {
		PrintWriter out = resp.getWriter();
		out.write("Page1");
		//輸出文字斷行
		out.println("Page1_3");
		out.print("Page1_2");
	}
	
}

package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Stream;
import java.util.HashMap;
@WebServlet("/testCheckBox")
public class TestCheckBoxServlet  extends HttpServlet{
	private String[] habitsTxt = {"音樂","閱讀","運動"};
	private HashMap<String,String> map = new HashMap();
	@Override
	public void init() throws ServletException {
		//可用來初始化Servlet
		map.put("0", "音樂");
		map.put("1", "閱讀");
		map.put("2", "運動");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		//設定取得Parameter的編碼
	    req.setCharacterEncoding("utf-8");
		//設定顯示中文於網頁上  設定getWriter為UTF-8編碼
		//setContentType 必須在getWriter之前設定
		resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
		//取得多選getParameterValues
		String[] habits = req.getParameterValues("habit");
		for (String s : habits) {
			int i = Integer.parseInt(s);
			System.out.println(habitsTxt[i]);
			//out.print(habitsTxt[i]);
			out.print(map.get(s));
		}	
		//輸出嗜好的list
		if(habits != null) {
			String habitList = Stream.of(habits).mapToInt(Integer::parseInt).
			mapToObj(i->habitsTxt[i]).
			reduce("", 
					(oh,newH)->oh+"<li>"+newH+"</li>");
			out.print("<ul>"+habitList+"</ul>");
		}
		//1 "" + <li>閱讀</li>
		//2 <li>閱讀</li> + <li>運動</li>
		
	}
}

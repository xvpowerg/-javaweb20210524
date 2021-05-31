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
import java.util.Map;
@WebServlet("/testCheckBox2")
public class TestCheckBoxServlet2  extends HttpServlet{
	private String[] habitsTxt = {"音樂","閱讀","運動"};

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {		
		//設定取得Parameter的編碼
	    req.setCharacterEncoding("utf-8");
		//設定顯示中文於網頁上  設定getWriter為UTF-8編碼
		//setContentType 必須在getWriter之前設定
		resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
    //除錯
	//可以看出所有Parameter name與value
	  Map<String,String[]> map =  req.getParameterMap();
	  map.forEach((k,v)->System.out.println(k+":"+v));
	  
		
	}
}

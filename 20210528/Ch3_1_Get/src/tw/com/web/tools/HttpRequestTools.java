package tw.com.web.tools;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class HttpRequestTools {
		
	public static String getParameter(HttpServletRequest req,
			String name,String def) {		
		String value = req.getParameter(name);
		Optional<String> option=  Optional.ofNullable(value);
		//如果value是null 會回傳def		
		return option.orElse(def);
	}
	
	public static int getParameter(HttpServletRequest req,
			String name,int def) {		
		//取得HttpServletRequest 的數值
		String value = getParameter(req,name,def+"");
		//把字串轉整數
		int result = def;
		try {
			result = Integer.parseInt(value);
		}catch(NumberFormatException ex) {
			System.err.println(ex);
		}
		return result;
	}
	
}

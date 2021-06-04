package tw.com.web.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.openejb.server.httpd.HttpRequest;
import org.apache.openejb.server.httpd.HttpResponse;
import java.util.concurrent.ThreadLocalRandom;

public class WebApplication {
	private static Map<String,MySession> sessionObjMap = new  HashMap();
	
	public static String MY_SESSION_ID = "MY_SESSION_ID";
	private WebApplication() {}
	
	public static MySession getSession(HttpServletRequest req,HttpServletResponse resp) {
		return getSession(req, resp,true);
	}
	
	public static MySession getSession(HttpServletRequest req,
			HttpServletResponse resp,boolean createNew) {
		
		MySession mySession = null;
		Cookie[] cookieArray =  req.getCookies();
		if (cookieArray != null) {
		Optional<Cookie>optional=Stream.of(cookieArray).
			filter(c->c.getName().equals(MY_SESSION_ID)).findFirst();
			if (optional.isPresent()) {
				String id = optional.get().getValue();
				 mySession =  sessionObjMap.get(id);
				 //if (mySession != null) {
					 return mySession;	 
			//	 }
				
			}
		}
		  //MySession���s�b�ݭn�إ߶�?��createNew �O�_��true
		if (createNew) {
			mySession = createSession(resp);
		}	
		return mySession;
	}
	
	
	private static MySession createSession(HttpServletResponse resp) {
		MySession mySession = new MySession();
		int idBase = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
		//�����16�i��
		String  sessionId = Integer.toHexString(idBase);
		Cookie cookie = new Cookie(MY_SESSION_ID,sessionId); 
		//�ϥ�Cookie����sessionId
		resp.addCookie(cookie);
		//MySession �s�W�� sessionObjMap
		sessionObjMap.put(sessionId, mySession);
		return mySession;
	}
	
}

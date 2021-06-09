package tw.com.web.tools;

import java.util.HashMap;
import java.util.Map;

public class MySession {
	
  private Map<String,Object> sessionMap = new HashMap<>();
   MySession() { }
   
   public void setAttribute(String name,Object obj) {
	   sessionMap.put(name, obj);
   }
   
   public Object getAttribute(String name) {
	   return sessionMap.get(name); 
   } 
}

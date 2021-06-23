package tw.com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class MySessionAttrListener  implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String msg = (String)event.getSession().getAttribute("msg");			
		System.out.println("Added getValue:"+event.getValue());
		System.out.println("Added:"+msg);
		
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String msg = (String)event.getSession().getAttribute("msg");//新值			
		System.out.println("Replaced getValue:"+event.getValue());//舊值
		System.out.println("Replaced:"+msg);//新值	
	
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String msg = (String)event.getSession().getAttribute("msg");			
		System.out.println("Removed getValue:"+event.getValue());//未移除前
		System.out.println("Removed:"+msg);//已移除為null
	}



}

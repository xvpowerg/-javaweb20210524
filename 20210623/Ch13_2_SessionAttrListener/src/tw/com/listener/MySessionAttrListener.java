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
		String msg = (String)event.getSession().getAttribute("msg");//�s��			
		System.out.println("Replaced getValue:"+event.getValue());//�­�
		System.out.println("Replaced:"+msg);//�s��	
	
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String msg = (String)event.getSession().getAttribute("msg");			
		System.out.println("Removed getValue:"+event.getValue());//�������e
		System.out.println("Removed:"+msg);//�w������null
	}



}

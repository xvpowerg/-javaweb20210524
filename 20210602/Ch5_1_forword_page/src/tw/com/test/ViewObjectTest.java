package tw.com.test;

import tw.com.bean.ViewObject;

public class ViewObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewObject.addDispatcherMapping("1", "/food");
		ViewObject.addDispatcherMapping("2", "/movie");
		ViewObject.addDispatcherMapping("3", "/sport");		
		ViewObject viewObject = new ViewObject("1","25","1");
		System.out.println(viewObject);
		System.out.println(viewObject.getDispatcherMapping());
	}

}

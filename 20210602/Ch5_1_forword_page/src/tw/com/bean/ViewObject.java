package tw.com.bean;

import java.util.HashMap;
import java.util.Map;

public class ViewObject {
	private String sex;
	private  String age;
	private  String type ;
	
	private static Map<String,String> mapping = new HashMap<>();
	
	public static void addDispatcherMapping(String type,String servletUrl) {
		mapping.put(type, servletUrl);
	}
	
	public  String getDispatcherMapping() {
		return mapping.get(type);
	}
	public ViewObject(String sex, String age, String type) {
		super();
		this.sex = sex;
		this.age = age;
		this.type = type;
	}
	
	public String getSexStrintg() {
		return sex.equals("0")?"¨k":"¤k";
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "ViewObject [sex=" + sex + ", age=" + age + ", type=" + type + "]";
	}

		
	

}

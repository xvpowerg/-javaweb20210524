package tw.com.web;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObj myob1 = new MyObj();
		MyObj myob2 = new MyObj();
		myob1.x = 10;
		myob2.x = 10;
		
		System.out.println(myob1.equals(myob2)  );
	}

}

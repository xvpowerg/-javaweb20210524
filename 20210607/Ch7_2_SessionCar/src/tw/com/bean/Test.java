package tw.com.bean;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ids = {"1","3","5"};
		List<Item> list = Item.getItem(ids);
		System.out.println(list);
	}

}

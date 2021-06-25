package tw.com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class MyProduces {
		
	@Produces
	@Named("apple")
	private List<Fruit> myFruitList(){
		List<Fruit> fruitList = new ArrayList<>();
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		f1.setName("��ī�G1");
		f2.setName("�pī�G2");
		f3.setName("�Cī�G3");
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);
		return fruitList;
	}
	@Produces
	@Named("cherry")
	private List<Fruit> myFruitList2(){
		List<Fruit> fruitList = new ArrayList<>();
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		f1.setName("�������1");
		f2.setName("�m�����2");
		f3.setName("�����3");
		fruitList.add(f1);
		fruitList.add(f2);
		fruitList.add(f3);		
		return fruitList;
		
	}
	
}

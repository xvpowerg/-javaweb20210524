package tw.com.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Item {
	private String id;
	private String name;
	private final static Map<String,Item> itemMap = new HashMap();
	//¼ÒÀÀ¸ê®Æ®w
	static {
		itemMap.put("1", new Item("1","Âû»L"));
		itemMap.put("2", new Item("2","Âû¯İ"));
		itemMap.put("3", new Item("3","ÂD³½"));
		
		itemMap.put("4", new Item("4","FF7"));
		itemMap.put("5", new Item("5","DQ11"));
		itemMap.put("6", new Item("6","RO2"));		
	}
	
	public static List<Item> getItem(String[] ids) {
		return 
		Stream.of(ids).
		map(id->itemMap.get(id)).
		collect(Collectors.toList());
	}
	
	public Item(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
	
}

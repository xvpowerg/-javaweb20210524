package tw.com.web.app;

import java.util.List;

import javax.servlet.http.HttpSession;

import tw.com.bean.Item;

public class WebTools {
		public static final String ITEM_LIST_NAME = "itemList";
		public static void  setItemListBySession(HttpSession session,
				List<Item> list){
			List<Item> perItemList = (List)session.getAttribute(ITEM_LIST_NAME);
			if (perItemList != null) {
				list.addAll(perItemList);
			}
			session.setAttribute(ITEM_LIST_NAME, list);		
		}
		public static List<Item>  getItemListBySession(HttpSession session){
			return (List)session.getAttribute(ITEM_LIST_NAME);
		}
}

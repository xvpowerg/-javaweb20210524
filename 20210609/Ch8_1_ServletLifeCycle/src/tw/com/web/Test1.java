package tw.com.web;

public class Test1 {
		public void init(int v) {
			System.out.println("init(int v)");
			init();
		}
		public void init() {
				System.out.println("init()");
		}
}

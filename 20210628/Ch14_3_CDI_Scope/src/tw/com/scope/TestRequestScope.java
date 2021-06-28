package tw.com.scope;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class TestRequestScope {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "TestRequestScope [name=" + name + "]";
		}
		
}

package tw.com.scope;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class TestSessionScope implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestSessionScope [name=" + name + "]";
	}
}

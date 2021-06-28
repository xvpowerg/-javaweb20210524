package tw.com.scope;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestApplcationScope {
	
	private int count;
	
	public synchronized void addCount() {
		count++;		
	}
	
	public synchronized int getCount() {
		return count;		
	}
}

package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMProvider {
	//EntityManager 由容器來維護 "交易" 與 EntityManager的物件
	@PersistenceContext
	@Produces
	private EntityManager em;
}

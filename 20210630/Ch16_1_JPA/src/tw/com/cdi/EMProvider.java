package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMProvider {
	//EntityManager �Ѯe���Ӻ��@ "���" �P EntityManager������
	@PersistenceContext
	@Produces
	private EntityManager em;
}

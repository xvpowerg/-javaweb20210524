package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;
//@Stateless ���ڭ̫إߤ@�s MyUserBean ���� 
//@Stateless �Ҧ�����k���n�L���A��
@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em;
	@Override
	public boolean crearUser(MyUser myuser) {
		try {
			em.persist(myuser);
		}catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
		
		return true;
	}

	@Override
	public MyUser findMyUser(String account, String password) {
		// TODO Auto-generated method stub
		TypedQuery<MyUser> query =   em.createNamedQuery("findMyUser",MyUser.class);
		query.setParameter("account", account);
		query.setParameter("password", password);
	//	query.getResultList(); �i���h��
		MyUser myUser = query.getSingleResult();
		return myUser;
	}

}

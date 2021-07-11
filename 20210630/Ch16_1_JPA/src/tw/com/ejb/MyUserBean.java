package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;
//@Stateless 幫我們建立一群 MyUserBean 物件 
//@Stateless 所有的方法都要無狀態的
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
	//	query.getResultList(); 可取多筆
		MyUser myUser = query.getSingleResult();
		return myUser;
	}

}

package tw.com.ejb;

import javax.ejb.Local;

import tw.com.jpa.MyUser;

@Local
public interface MyUserBeanLocal {
	boolean crearUser(MyUser myuser);
	MyUser findMyUser(String account, String password);
}

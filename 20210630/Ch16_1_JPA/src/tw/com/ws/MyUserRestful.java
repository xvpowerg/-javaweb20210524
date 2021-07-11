package tw.com.ws;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
public class MyUserRestful {
	@EJB
	MyUserBeanLocal myUserBean;
	@GET	
	public String hello() {
		return "{\"msg\":\"myuser\"}";
	}
	@POST
	public String createUser(@FormParam("account") String ac,
			@FormParam("password") String pw) {
		MyUser myUser = new MyUser();
		myUser.setAccount(ac);
		myUser.setPassword(pw);
		myUserBean.crearUser(myUser);
		//Jackson 可把物件轉JSON
		ObjectMapper objMap = new ObjectMapper();
		String json = "";		
		try {
			json = objMap.writeValueAsString(myUser);
		} catch (JsonProcessingException e) {
			System.out.println(e);
		}
		return json;
	}
	
	@POST
	@Path("login")
	public String login(@FormParam("account") String ac,
			@FormParam("password") String pw) {
		
		MyUser myUser = myUserBean.findMyUser(ac, pw);
		//Jackson 可把物件轉JSON
		ObjectMapper objMap = new ObjectMapper();
		String json = "";		
		try {
			json = objMap.writeValueAsString(myUser);
		} catch (JsonProcessingException e) {
			System.out.println(e);
		}
		return json;
	}
	
}

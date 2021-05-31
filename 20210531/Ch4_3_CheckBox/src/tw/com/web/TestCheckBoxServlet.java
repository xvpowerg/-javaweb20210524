package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Stream;
import java.util.HashMap;
@WebServlet("/testCheckBox")
public class TestCheckBoxServlet  extends HttpServlet{
	private String[] habitsTxt = {"����","�\Ū","�B��"};
	private HashMap<String,String> map = new HashMap();
	@Override
	public void init() throws ServletException {
		//�i�ΨӪ�l��Servlet
		map.put("0", "����");
		map.put("1", "�\Ū");
		map.put("2", "�B��");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		//�]�w���oParameter���s�X
	    req.setCharacterEncoding("utf-8");
		//�]�w��ܤ��������W  �]�wgetWriter��UTF-8�s�X
		//setContentType �����bgetWriter���e�]�w
		resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
		//���o�h��getParameterValues
		String[] habits = req.getParameterValues("habit");
		for (String s : habits) {
			int i = Integer.parseInt(s);
			System.out.println(habitsTxt[i]);
			//out.print(habitsTxt[i]);
			out.print(map.get(s));
		}	
		//��X�ݦn��list
		if(habits != null) {
			String habitList = Stream.of(habits).mapToInt(Integer::parseInt).
			mapToObj(i->habitsTxt[i]).
			reduce("", 
					(oh,newH)->oh+"<li>"+newH+"</li>");
			out.print("<ul>"+habitList+"</ul>");
		}
		//1 "" + <li>�\Ū</li>
		//2 <li>�\Ū</li> + <li>�B��</li>
		
	}
}

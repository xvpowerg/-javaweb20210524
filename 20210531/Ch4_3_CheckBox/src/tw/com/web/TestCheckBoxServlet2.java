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
import java.util.Map;
@WebServlet("/testCheckBox2")
public class TestCheckBoxServlet2  extends HttpServlet{
	private String[] habitsTxt = {"����","�\Ū","�B��"};

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {		
		//�]�w���oParameter���s�X
	    req.setCharacterEncoding("utf-8");
		//�]�w��ܤ��������W  �]�wgetWriter��UTF-8�s�X
		//setContentType �����bgetWriter���e�]�w
		resp.setContentType("text/html;charset=UTF-8");
	PrintWriter out = resp.getWriter();
    //����
	//�i�H�ݥX�Ҧ�Parameter name�Pvalue
	  Map<String,String[]> map =  req.getParameterMap();
	  map.forEach((k,v)->System.out.println(k+":"+v));
	  
		
	}
}

package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
//1 �Y�����O ���~�� HttpServlet �ܬ�Servlet
//2 �N�����O�n�O��e����
	//�n�O�覡��2
	//1 �ϥ�(WebServlet)�`�� ²�� �u�ʤp
	//2 �ϥ�web.xml �·� �u�ʤj
	//HttpServletRequest input �i�Ψӱ��� �Ȥ�ݶǰe���T�� 
	//HttpServletResponse output �^���Ȥ�ݪ���T
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws IOException {
		PrintWriter out = resp.getWriter();
		out.write("Page1");
		//��X��r�_��
		out.println("Page1_3");
		out.print("Page1_2");
	}
	
}

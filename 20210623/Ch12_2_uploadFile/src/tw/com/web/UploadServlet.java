package tw.com.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//�Ʊ�o��Servlet��W���ɮ�
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet  extends HttpServlet{
	
	private  String imagePath;
	public void init(){
		  imagePath = 
					getServletContext().getInitParameter("imagePath");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Part part =	req.getPart("photo");
		//�i���o�W�Ǫ��ɮצW��
		String fileName = part.getSubmittedFileName();
		String path = imagePath+File.separator+fileName;
		File file = new File(path);		
		//���o�W���ɮת�input
		InputStream input = part.getInputStream();
		//���o�W�ǥؼЪ�output
		OutputStream output = new FileOutputStream(file);
		
		try(BufferedInputStream bfin = new BufferedInputStream(input);
			BufferedOutputStream bfout = new BufferedOutputStream(output);){
			int data = -1;			
			while((data = bfin.read())!= -1) {
				bfout.write(data);				
			}
		}
		
		resp.getWriter().println("Complete!");
		
	}
}

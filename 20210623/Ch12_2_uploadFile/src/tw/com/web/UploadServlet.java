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
//希望這個Servlet能上傳檔案
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
		//可取得上傳的檔案名稱
		String fileName = part.getSubmittedFileName();
		String path = imagePath+File.separator+fileName;
		File file = new File(path);		
		//取得上傳檔案的input
		InputStream input = part.getInputStream();
		//取得上傳目標的output
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

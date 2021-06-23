package tw.com.web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/showImage")
public class ShowImageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String imageFilePath =
				"C:\\Users\\xvpow\\eclipse-workspace\\Ch12_2_uploadFile\\WebContent\\images";
	   Path imagePath =  Paths.get(imageFilePath);	
	   Files.list(imagePath).map(p->p.getFileName().toString()).
	   forEach(im->System.out.println(im));
	   //¤p§@·~
	   req.setAttribute("xxx", "");
	   req.getRequestDispatcher("show_image.jsp").forward(req, resp);
	
	}
}

package vn.iostar.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iostar.model.Usermodel;
import vn.iostar.service.UserService;
import vn.iostar.service.ipl.UserServiceipl;

@WebServlet(urlPatterns= { "/register"})
public class Register extends HttpServlet{
	UserService service = new UserServiceipl();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
	    String password = req.getParameter("password");
	    String imagines = req.getParameter("imagines");
	    String fullname = req.getParameter("fullname");
	    String email = req.getParameter("email");
	    String phone = req.getParameter("phone");
	    int roleid = Integer.parseInt(req.getParameter("roleid"));
	    String createDate = req.getParameter("createDate");

		Usermodel user = null;
		try {
			user = service.registeruser(username, password,imagines,fullname,email,phone,roleid,createDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if (user != null ) {
	    	req.getRequestDispatcher("/views/loginw.jsp").forward(req, resp);

	    } else {
			String alertMsg = "Trùng tài khoản mật khẩu ";
			req.setAttribute("alert", alertMsg);	        
			RequestDispatcher rd = req.getRequestDispatcher("views/register.jsp");
	        rd.forward(req, resp);
	    }
	}
	
	
	
}

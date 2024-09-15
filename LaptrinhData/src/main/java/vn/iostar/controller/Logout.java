package vn.iostar.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns ="/logout")
public class Logout extends HttpServlet {

	private static final long serialVersionUID = -2293530038559386286L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		  Cookie[] cookies = req.getCookies(); 
		  if (cookies != null) { 
			  for (Cookie cookie : cookies) 
			  { 
				  	cookie.setValue("");
				  	cookie.setMaxAge(0); 
			  		cookie.setPath("/");
			  		resp.addCookie(cookie); 
			  		} 
			  }
		  
		  HttpSession session = req.getSession(false); if (session != null) {
		  session.invalidate(); }
		  
		  req.getRequestDispatcher("views/loginw.jsp").forward(req, resp);
		 
		}

}

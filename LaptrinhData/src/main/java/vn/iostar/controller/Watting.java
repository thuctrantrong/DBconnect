package vn.iostar.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iostar.model.Usermodel;


@SuppressWarnings("serial")
@WebServlet(urlPatterns="/waiting")
public class Watting extends HttpServlet{

	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
	 HttpSession session= req.getSession();
	 if (session != null && session.getAttribute("account") != null) {
			Usermodel u = (Usermodel) session.getAttribute("account");
			req.setAttribute("username", u.getUsername());
			if (u.getRoleid() == 1) {
				resp.sendRedirect(req.getContextPath() + "/admin/home");
			} else if (u.getRoleid() == 2) {
				resp.sendRedirect(req.getContextPath() + "/manager/home");
			} else {
				resp.sendRedirect(req.getContextPath() + "/home");
			}
		} else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}
	 }	
}

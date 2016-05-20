package com.javaproject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;
import javax.servlet.ServletException;

import com.javaproject.LoginModel;

@Controller

public class LogoutController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	 @RequestMapping(value="/logout") 
	 
	 public ModelAndView logout(HttpServletRequest request, HttpServletResponse response,HttpSession session ) 
			 throws ServletException, IOException
	 {
		 //LoginModel loginModel = new LoginModel();
		 System.out.println(session.getAttribute("Email"));
		 System.out.println("In Logout controller");
		 
		  session = request.getSession(false);
		  
		  if(session!=null) { 
			  session.invalidate();
		  }
		  String message = "you have successfully logged out.";
		  return new ModelAndView("logout","message",message);
	 } 
}
	 
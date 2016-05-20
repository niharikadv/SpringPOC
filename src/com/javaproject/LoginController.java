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
import com.javaproject.LoginDao;

@Controller

public class LoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	//private LoginDao loginDao;
	/*HttpServletRequest request;
	HttpServletResponse response;
	public String Email=request.getParameter("email_id"); 
	public String Password=request.getParameter("pass");*/
	
	 @RequestMapping(value="/login") 
	 
	 public ModelAndView login(HttpServletRequest request, HttpServletResponse response,HttpSession session ) 
			 throws ServletException, IOException
	 {
		 LoginModel loginModel = new LoginModel();		 
		 
		 String Email=request.getParameter("email"); 
		 String Password=request.getParameter("Password");
		
		 loginModel.setUsername(Email); 
		 loginModel.setPassword(Password);

		 LoginDao loginDao = new LoginDao(); 
		 String userValidate = loginDao.authenticateUser(loginModel);
		 System.out.println(userValidate);
		 if(userValidate.equals("SUCCESS")) {
			 session = request.getSession(true);
			 session.setAttribute("session", Email);
			return new ModelAndView("welcome");
		 }
		 else {
			 System.out.println("Either user name or password is wrong.");
			 return new ModelAndView("error"); 
		 }
	 } 
	 
	 @RequestMapping(value="/registration") 
	 
	 public ModelAndView insertDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 LoginModel loginModel=new LoginModel();
		 System.out.println("register here");
		
		 String firstName=request.getParameter("Fname"); 
		 String lastName=request.getParameter("Lname");
		 String Password=request.getParameter("pass");
		 String MobNum=request.getParameter("MobNo");
		 String Email=request.getParameter("email_id");
		 String ReTypePassword=request.getParameter("Confpassword");
		 String message=null;
	
		 loginModel.setFname(firstName);
		 loginModel.setLname(lastName);
		 loginModel.setMobileNo(MobNum);
		 loginModel.setPassword(Password);
		 loginModel.setUsername(Email);
		 loginModel.setReTypePassword(ReTypePassword);
		 
		 LoginDao loginDAO=new LoginDao();
		 loginDAO.InsertUser(loginModel);
	
		 message="you are succesfully registered ";
		 return new ModelAndView("success", "message",message);
	}
}
	 
package com.javaproject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import com.javaproject.LoginModel;
import com.javaproject.LoginDao;

@Controller
public class titleController {
	
	 @RequestMapping(value="/title")
	 public ModelAndView getTitle(HttpServletRequest request, HttpServletResponse response,HttpSession session, ModelMap model ) 
			 throws ServletException, IOException
	 {
		 //ModelAndView modelAndView = new ModelAndView();
		 LoginModel loginModel = new LoginModel();
		 System.out.println("hi inside Title controller");
		 String TitleName=request.getParameter("value");
		 System.out.println(TitleName);
		 
		 loginModel.setTitle (TitleName);
		 
		 LoginDao loginDao = new LoginDao(); 
		 List titleArticle=loginDao.getArticle(loginModel);
		 
		 model.addAttribute("Article",titleArticle.get(0));
		 System.out.println(titleArticle);
		
		 return new ModelAndView ("article");
      }
}

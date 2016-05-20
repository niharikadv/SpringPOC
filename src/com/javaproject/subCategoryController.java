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
public class subCategoryController {
	
	 @RequestMapping(value="/subCategory")
	 public ModelAndView getSubCategoryDetails(HttpServletRequest request, HttpServletResponse response,HttpSession session, ModelMap model ) 
			 throws ServletException, IOException
	 {
		 //ModelAndView modelAndView = new ModelAndView();
		 LoginModel loginModel = new LoginModel();
		 System.out.println("hi inside subcategory controller");
		 String Sub_categoryName=request.getParameter("value");
		 System.out.println(Sub_categoryName);
		 
		 loginModel.setSub_category (Sub_categoryName);
		 
		 LoginDao loginDao = new LoginDao(); 
		 List SubCategoryTitle=loginDao.getTitle(loginModel);
		 
		 model.addAttribute("titleName", SubCategoryTitle.get(0));
		 model.addAttribute("title", SubCategoryTitle.get(1));
		
		 System.out.println(SubCategoryTitle);
		
	     return new ModelAndView ("Title");

     }
}





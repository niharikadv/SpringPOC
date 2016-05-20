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

public class CategoryDetailsController {
	
	 @RequestMapping(value="/categorydetails")
	 public ModelAndView getCategoryDetails(HttpServletRequest request, HttpServletResponse response,HttpSession session, ModelMap model ) 
			 throws ServletException, IOException
	 {
		 //ModelAndView modelAndView = new ModelAndView();
		 LoginModel loginModel = new LoginModel();
		 
		 String categoryName=request.getParameter("value");
		 System.out.println(categoryName);
		 loginModel.setCategory(categoryName);
		 
	     List CategoryDetails=new LoginDao().getSubCategories(loginModel);
		 model.addAttribute("subCategoryName", CategoryDetails.get(0));
		 model.addAttribute("subCategory", CategoryDetails.get(1));
		 model.addAttribute("sub_Category", CategoryDetails.get(2));

		 System.out.println(CategoryDetails);
		 
		 if(request.getSession(true) != null && CategoryDetails != null){
			 return new ModelAndView("sub_categories");
		 }
		 else {
			 return new ModelAndView("index"); 
		 }
	 }	
}
	

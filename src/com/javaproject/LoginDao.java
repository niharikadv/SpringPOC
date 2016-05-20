package com.javaproject;
 import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaproject.LoginModel;
import com.javaproject.DBConnection;
 public class LoginDao {
	 
	 public String authenticateUser(LoginModel loginModel) {
		 String userName = loginModel.getUsername(); 
		 String password = loginModel.getPassword();
	  
		 Connection con = DBConnection.createConnection();
		 Statement statement = null;
		 ResultSet resultSet = null;
	
		 String userNameDB = "";
		 String passwordDB = "";
		 try {
			 statement = con.createStatement(); 
			 resultSet = statement.executeQuery("select Email_Id,Password from User"); 
			 
			 while(resultSet.next()) {
				 userNameDB = resultSet.getString("Email_Id"); 
				 passwordDB = resultSet.getString("Password");
			  
				 if(userName.equals(userNameDB) && password.equals(passwordDB)) {	  
					 return "SUCCESS"; 
				 }
				 else {
					 System.out.println("not a valid user");
					 return "error";
				 }
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return "Invalid user credentials"; 
	 }
 
 public String InsertUser(LoginModel loginModel) {
	 Connection con = DBConnection.createConnection();
	 Statement statement = null;
	
	 System.out.println(" test connection");
	 
	 /*Integer UserId=loginModel.getU_id();*/
	 String Firstname=loginModel.getFname();
	 String Lastname=loginModel.getLname();
	 String Email=loginModel.getUsername();
	 String Password=loginModel.getPassword();
	 String MobileNum=loginModel.getMobileNo();
	 System.out.println("test db connection");
	 
	 try {
		 statement = con.createStatement(); 
		 String query="insert into User(FName,LName,Password,Email_Id,PhoneNo) values('"+Firstname+"','"+Lastname+"','"+Password+"','"+Email+"','" + MobileNum+"')";
		 int result = statement.executeUpdate(query);
		 System.out.println(result+"column inserted");
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 
	 return "success";
 }
 
 public List getSubCategories(LoginModel loginModel) {
	 Connection con = DBConnection.createConnection();
	 Statement statement = null;
	 List<String> results = null;
	 
	 System.out.println("sub category connection");
	 
	 String categoryName=loginModel.getCategory();
	 System.out.println(categoryName);
	 
	 try {
		 System.out.println("database connection created");
		 statement = con.createStatement(); 
		 String query="select a.S_name from Sub_Category a join Category m on a.Cat_Id=m.Id where m.Category_name='"+categoryName+"'";
	     ResultSet rs = statement.executeQuery(query);
	     results = new ArrayList<String>();
	     
	     while(rs.next()){
    	 results.add(rs.getString("S_name"));
    	 }
        rs.close();
	  }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return results;
   }
 
 public List getTitle(LoginModel loginModel) {
	 Connection con = DBConnection.createConnection();
	 Statement statement = null;
	 List<String> result = null;
	 
	 System.out.println("Title connection");
	 
	 String TitleName=loginModel.getSub_Category();
	 System.out.println(TitleName);
	 
	 try {
		 System.out.println("database connection created");
		 statement = con.createStatement(); 
		 String query="select a.Title from Content a join Sub_Category m on a.S_id=m.S_id where S_name ='"+TitleName+"'";
	     ResultSet rs = statement.executeQuery(query);
	     result = new ArrayList<String>();
     while(rs.next()){
    	 result.add(rs.getString("Title"));
      }
     rs.close();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return result;
   }
 
 public List getArticle(LoginModel loginModel) {
	 Connection con = DBConnection.createConnection();
	 Statement statement = null;
	 List<String> result = null;
	 
	 String articleName=loginModel.getTitle();
	 System.out.println(articleName);
	 
	 try {
		 System.out.println("database connection created");
		 statement = con.createStatement(); 
		 String query="select a.Article from Content a join Sub_Category m on a.S_id=m.S_id where Title ='"+articleName+"'";
	     ResultSet rs = statement.executeQuery(query);
	     result = new ArrayList<String>();
	     
	     while(rs.next()){
    	 result.add(rs.getString("Article"));
      }
     rs.close();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return result;
   }
 } 

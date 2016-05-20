package com.javaproject;

public class LoginModel {
	
	private Integer U_id;
	private String Firstname = null ;
	private String Lastname = null ;
	private String PhoneNo = null ;
	private String Email = null ;
	private String Password = null ;
	private String retypePassword = null ;
	private String Category = null;
	private String Sub_category=null;
	private String Title=null;
	
	public String getCategory()
	{
		return Category;
	}
	public void setCategory(String Category)
	{
		this.Category=Category;
	}
	public String getSub_Category()
	{
		return Sub_category;
	}
	public void setSub_category(String Sub_category)
	{
		this.Sub_category=Sub_category;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String Title)
	{
		this.Title=Title;
	}
	public Integer getU_id()
	{
		return U_id;
	}
	public void setU_id(Integer U_id)
	{
		this.U_id=U_id;
	}
	public String getFname()
	{
		return Firstname;
	}
	public void setFname(String Firstname)
	{
		this.Firstname=Firstname;
	}
	public String getLname()
	{
		return Lastname;
	}
	public void setLname(String Lastname)
	{
		this.Lastname=Lastname; 
	}
	public String getUsername()
	{
		return Email;
	}
	public void setUsername(String Email)
	{
		this.Email=Email;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String Password)
	{
		this.Password=Password;
	}
	
	public String getMobileNo()
	{
		return PhoneNo;
	}
	public void setMobileNo(String PhoneNo)
	{
		this.PhoneNo=PhoneNo;
	}
	public  String getReTypePassword()
	{
		return retypePassword; 
	}
	public void setReTypePassword( String retypePassword)
	{
		this.retypePassword=retypePassword;
	}
}

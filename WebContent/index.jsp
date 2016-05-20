<!DOCTYPE HTML> <html> 
<head> 
	<title>Spring MVC login example.</title> 
	 <!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"> -->
	<style type="text/css">
		body
		{
		background-color:#fff;
		margin:10px;
		}
		.header {
		    padding:0.3em;;
		    text-align: center;
		}
		.header h1 {
		    color: #272727;
		    font-size: 22px;
		    font-weight: 700;
		}
		.main p {
		    border-bottom: 1px solid #e7e0e0;
		    color: #383737;
		    font-size: 15px;
		    font-weight: 600;
		    margin-top: -13px;
		    padding: 20px 30px;
		    text-align: center;
		}
		form {
		    padding-bottom: 0em;
		}
		.left-form, .right-form {
		    float: left;
		    margin: 22px 28px;
		    width: 40%;
		     
		}
		ol, ul {
		    list-style: outside none none;
		    padding: 0;
		}
		.main h2, .main h3 {
		    color: #3f3d3d;
		    font-size: 17px;
		    font-weight: 600;
		    margin: 15px 3px;
		    text-align: left;
		}
		.left-form li {
		    border: 0px solid #ebebeb;
		    border-radius: 0.3em;
		    color: #4d4949;
		    display: block;
		    margin-bottom: 18px;
		   
		}
		.left-form input[type="text"], .left-form input[type="email"], .left-form input[type="password"] {
		    border: medium none;
		    color: #000;
		    float: left;
		    font-family: "Open Sans",sans-serif;
		    font-size: 15px;
		    outline: medium none;
		    padding: 0.5em 1em 0.5em 2em;
		    width: 80%;
		    border: 1px solid #ccc;
		}
		/* .ticker {
		   /*  background: url("../images/spirit.png") no-repeat scroll 0 0 rgba(0, 0, 0, 0); */
		} */
		/* .icon {
		    display: block;
		    float: right;
		    height: 20px;
		    margin: 7px 9px 9px 0;
		    width: 20px;
		} */
		a {
		    text-decoration: none;
		}
		
		.left-form input[type="submit"] {
		    background: none repeat scroll 0 0 #f3f3f3;
		    border: 1px solid #ebebeb;
		    border-radius: 0.3em;
		    color: #4d4949;
		    cursor: pointer;
		    font-size: 15px;
		    font-weight: bold;
		    margin-top: 15px;
		    outline: medium none;
		    padding: 10px 19px;
		    transition: all 0.5s ease-out 0s;
		}
		.clear {
		    clear: both;
		}
		.right-form {
		    float: right;
		}
		.left-form, .right-form {
		    margin: 22px 28px;
		    width: 40%;
		}
		ol, ul {
		    list-style: outside none none;
		    padding: 0;
		}
		.right-form li {
		    border: 0px solid #ebebeb;
		    border-radius: 0.3em;
		    color: #4d4949;
		    display: block;
		    margin-bottom: -4px;
		}
		.right-form input[type="text"], input[type="password"] {
		    border: medium none;
		    color: #000;
		    font-family: "Open Sans",sans-serif;
		    font-size: 15px;
		    outline: medium none;
		    padding: 0.9em 0.8em;
		    width: 89%;
		    border: 1px solid #ccc;
		}
		.main h4 {
		    color: #363535;
		    float: left;
		    font-size: 13px;
		    font-weight: 600;
		}
		.right-form input[type="submit"] {
		  background: none repeat scroll 0 0 #f3f3f3;
		    border: 1px solid #ebebeb;
		    border-radius: 0.3em;
		    color: #4d4949;
		    cursor: pointer;
		    font-size: 15px;
		    font-weight: bold;
		    margin-top: 15px;
		    outline: medium none;
		    padding: 10px 19px;
		    transition: all 0.5s ease-out 0s;
		}
		 h2 { 
		 	color:#00000;
		 }
	</style>
<script type="text/javascript">
function validateRegisterForm() {
	var FirstName=document.registerForm.Fname.value; 
	var LastName=document.registerForm.Lname.value; 
	var phoneNumber =document.registerForm.MobNo.value;
	var reg = /^\d{10}$/;
	/* var OK = reg.exec(phoneNumber.value); */
	var password=document.registerForm.pass.value;
	var password2=document.registerForm.Confpassword.value;
		if(FirstName==null || FirstName=="")
		{
			alert("firstname should not be empty");
			return false;
		}
	   	if(LastName==null || LastName=="")
		{
		   alert("LastName should not be empty");
		   return false;
		}
	  	if(password==null ||password==" ")
		{
			alert("password field should not be empty");
			return false;
		}
	   else if(password.length<6)
		{
			alert("password field should be greater than 6");
		}
      	if(password!=password2)
		{
			alert("passwords do not match,please retype correct password");
	    	return false;
		}
	   	if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.registerForm.email_id.value))
	   	{
			alert("You have entered an invalid email address!")
			return false;
	   	} 
	   	if(phoneNumber=="")
		{
			alert("phone number should not be empty");
	   		return false;
		}
	   	if(!phoneNumber.match(reg)){
		   alert("invalid phone number,please enter the correct phone number "); 
	        return false;
	   } 
	   return true;
	}
	function validateLoginForm()
	{
		var Password=document.LoginForm.Password.value;
		var UserName=document.LoginForm.email.value;
		var reg="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$";
		  if(Password==null ||Password=="")
			{
				alert("password field should not be empty");
				return false;
			}
		   else if(Password.length<6)
			{
				alert("password field should be greater than 6");
			}
			if(UserName=="" || UserName==null)
			{
				alert("enter your email address");
				return false;
			}
			else if(!UserName.match(reg)){
			   alert("please enter the valid email address"); 
		       return false;
			}
		return true;
	}
</script> 
</head>  
 <body>
 
    <jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include> 
	<div class="header">
 	
 	<center>
	   <b><h1>Login or Create a Free Account!</h1></b>
	</center>
    <!-- <p>Lorem ipsum dolor sit amit,consetetur sadipscing eliter,sed diam voluptua.At vero eso et accusam et justo duo dolores et ea rebum. </p> -->
      <form action="registration.html" method="post" name="registerForm" onsubmit="return validateRegisterForm()">
       <ul class="left-form">
        <h2>New Account:</h2>
         <li>
	       <input type="text" required="" placeholder="Firstname" name="Fname">
	       <div class="clear"> </div>
	     </li>
       
	       <li>
			<input type="text" required="" placeholder="Lastname" name="Lname">
			<div class="clear"> </div>
		   </li>

			<li>
			<input type="text" required="" placeholder="MobileNumber" name="MobNo">
			<div class="clear"> </div>
			</li>

			<li>
			<input type="email" required="" placeholder="Email" name="email_id">
			<div class="clear"> </div>
			</li>
		
			<!-- <li>
			<input type="text" required="" placeholder="UserType" name="Utype">
			<select>
			<option value="author">Author</option>
			  <option value="viewer">Viewer</option>
			</select>
			<div class="clear"> </div>
			</li> -->
		
			<li>
			<input type="password" required="" placeholder="Password" name="pass">
			<div class="clear"> </div>
			</li>
			
			<li>
			<input type="password" required="" placeholder="Confirm Password" name="Confpassword">
			<div class="clear"> </div>
			</li>
			
        
			<input type="submit" value="Submit"/>
		    <div class="clear"></div>
        
       </ul>
     </form>
        
      <form action="login.html" method="post"  name="LoginForm" onsubmit="validateLoginForm()">
        <ul class="right-form">
          <ul>
           <h2>Login:</h2>
				<li>
				<input type="text" required="" placeholder="username" name="email"><br>
				<br>
				<!-- <div class="icon ticker" href="#"> </a> -->
				<div class="clear"> </div>
				</li>
			
				<li>
				<input type="password" required="" placeholder="password"   name="Password">
				<!-- <a class="icon ticker" href="#"> </a> -->
				<div class="clear"></div>
				</li>
				
				 <input type="submit" value="login">
				<div class="clear"></div>
	      </ul> 
		</ul> 
	</form>
	</div>	 
</body> 
</html>
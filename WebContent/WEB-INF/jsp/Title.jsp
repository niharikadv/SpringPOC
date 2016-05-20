<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
		<style type="text/css">
			
		  body {
		    color: #A9A9A9;
		    font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
		    font-size: 14px;
		    line-height: 1.42857;
		    background-color:#fff;
		
		}
		.container {
		     margin-left: auto;
		    margin-right: auto;
		    padding-left: 15px;
		    padding-right: 15px;
		    /* width: 900px; */
		}   
		.navbar-static-top {
		    border-width: 0 0 1px;
		    top: 0;
		    border-radius: 0;
		     left: 0;
		    position: static;
		    right: 0;
		    z-index: 1030;
		}
		
		.navbar-static-bottom {
		    left: 0;
		    position: fixed;
		    right: 0;
		    z-index: 1030;
		    border-radius: 0;
		}
		.navbar {
		    margin-bottom: 20px;
		    min-height: 50px;
		    content: " ";
		    display: table;
		    clear:both;
		}
		
		.navbar-default  {
		   background-color:#dc181f;
		   /*  border-color: #e7e7e7; */
		    color: #777;
		    content: " ";
		    display: block;
		    clear:both;
		}
		/* .navbar-brand {
		    float: right;
		    font-size: 18px;
		    height: 50px;
		    line-height: 20px;
		    padding: 15px;
		    color:white;
		    content: " ";
		    display: table;
		    clear:both;  
		}
		 */
		a {
		    background-color: transparent;
		    text-decoration: none;
		    content: " ";
		    display: table;
		    clear:both;
		}
		
		.logo {
			color:#FFFFFF;
			position:relative;
			float:left;
		 }

		/* .topnav { 
		 	font-size: 0.8em;
		  	color: #000;
		 	background-color: #FFCF29;
		 	border: 1px #00009C solid;
		 	padding: 0.5em;
		 } */
		h1 {
			color:black;
		}
		.pull-left {
			color:white;
			font-size:20px;
		}
		.pull-right {
			color:white;
			fomt-size:15px;
		}
		</style>
	</head>
	
	<body>	
 		<nav class="navbar navbar-default navbar-static-top">
			<div class="container">
		 
		     <a class="pull-left"><b>BlogLogo</b></a>
		     <%-- <img src="<c:url value="/WEB-INF/images/example_image.png"/>"/> --%>
		     <a class="pull-right">      
		    	<%
				 if (session != null) {
					if (session.getAttribute("session")!= null) {
						String name = (String) session.getAttribute("session");
						out.print("Hello, " + name + " Welcome to ur Profile");
					}
					else {
						out.print("u are not logged in");
					response.sendRedirect("index.jsp");
					}
				}
				%>
			</a>
 			<a class="pull-right" href="logout.html">Logout</a>
    	</div>
    </nav> 
    
<%-- <jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include> --%>
	<center>
		<h1>TITLE FOR EACH SUB-CATEGORY</h1>
		<h3><a href="title.html?value=${titleName}"><c:out value="${titleName}" /></a></h3>
		<h3><a href="title.html?value=${title}"><c:out value="${title}" /></a></h3>
	</center>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.ServletContextListener" %>
<%@ page import="javax.servlet.ServletContextEvent" %>
<%@ page import="javax.servlet.ServletContext" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 


File file=new  File("C:\\Users\\Shree\\Desktop\\sadashiv resume"); 
String fileNames[]=file.list();
for(int i=0;i<fileNames.length;i++)
{
	out.write("<br>");
	out.write("<a href=\"UploadDownloadFileServlet?fileName="+fileNames[i]+"\">Download "+fileNames[i]+"</a>");
    out.println(fileNames[i]);
}
//File file = new File(rootPath + File.separator + relativePath);

%>
</body>
</html>

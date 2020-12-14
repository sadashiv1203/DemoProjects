<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


     <h1>${heading}</h1><br>
     <form:errors path="student1.*"/>
     <form method="post" action="/Web-MVC/submitAdmissionForm.html" modelAttribute="user">
     
        <table>
            <tr>
               <td>Student's Name:</td><td> <input type="text" name="studentName" /> </td>
            </tr>
            <tr>
               <td>Student's Hobby:</td><td> <input type="text" name="studentHobby" /> </td>
            </tr>
            <tr>
               <td>Student's Mobile:</td><td> <input type="text" name="studentMobile" /> </td>
            </tr>
            <tr>
               <td>Student's DOB:</td><td> <input type="text" name="studentDOB" /> </td>
            </tr>
            <tr>
               <td>Student's Skills Set:</td><td> <select name="studentSkills" multiple>
                                                   <option value="java core">java core</option>
                                                   <option value="spring core">spring core</option>
                                                   <option value="java mvc">java</option>
                                                  </select> </td>
            </tr>
            <tr>
                 <td> <input type="submit" value="submitfORM" /> </td>
            </tr>
        </table>
     
     </form>

</body>
</html>
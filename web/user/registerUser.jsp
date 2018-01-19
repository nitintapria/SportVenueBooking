<%-- 
    Document   : registerUser
    Created on : Aug 11, 2017, 1:23:42 AM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        
        <script>
            function getCity(sid)
            {
                var http = new XMLHttpRequest();
                http.open("getcity.htm?sid="+sid);
                http.send();
                http.onreadystatechange=function()
                {
                    if(http.readyState==4 && http.status==200) 
                    {
                        document.getElementById("city").innerHTML=http.responseText;
                    }
                }
            }   
        </script>
    </head>
    
        <spr:form action="registerUser.htm" commandName="users">
            Login Id:<spr:input path="loginId"/>
            <br>
            Password:<spr:password path="password"/>
            <br>
            Name:<spr:input path="uname"/>
            <br>
            Gender: Male <spr:radiobutton path="gender" value="true"/>
            Female <spr:radiobutton path="gender" value="false"/>
            <br>
            
            <%--<spr:select path="stateId" class="ajaxField" onchange="getCity(this.value)">--%>
                  <%--<spr:options items="${lsm}" itemValue="stateId" itemLabel="stateName"/>--%>
            <%--</spr:select>--%>
            <br>
            City <div id="city">
                <select>
                    <option value="">select
                </select>
            </div>
            
            <br>
            Address: <spr:textarea rows="20" cols="20" path="address"/>
            <br>
            Zipcode: <spr:input path="zipcode"/>
            <br>
            Email:<spr:input path="email"/>
            <br>
            Contact:<spr:input path="contact"/>
            <br>
            <input type="submit" value="Submit">
        </spr:form>
    
</html>

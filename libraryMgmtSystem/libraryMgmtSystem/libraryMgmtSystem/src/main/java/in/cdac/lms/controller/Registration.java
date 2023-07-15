/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package in.cdac.lms.controller;

import in.cdac.lms.DBops.DBOperations;
import in.cdac.lms.DBops.StudentEntity;
import in.cdac.lms.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CDAC
 */
public class Registration extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        int rollnumber = 0;
        String name = request.getParameter("sname");
        String email = request.getParameter("emailid");
        String mobile = request.getParameter("mobile");
        
        System.out.println("=== mobile"+mobile);
        DBOperations db = new DBOperations();
        StudentEntity std = new StudentEntity();
        std.setStudentName(name);
        std.setEmailID(email);
        std.setMobileNumber(mobile);
        rollnumber = db.saveStudent(std);
        if(rollnumber != 0){
            out.println("<h3>Registration is successful</h3>");
            out.println("Your Roll Number is :"+rollnumber);                
        }else{
            out.println("<h3>Registration is unsuccessful. Please try later</h3>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.model;

/**
 *
 * @author CDAC
 */
public class Student {
    private int rollNumber;
    private String studentName;
    private String emailID;
    private String mobile;

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", studentName=" + studentName + ", emailID=" + emailID + ", mobile=" + mobile + '}';
    }
       

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

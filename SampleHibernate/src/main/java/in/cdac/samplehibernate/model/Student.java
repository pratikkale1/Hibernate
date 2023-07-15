/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.samplehibernate.model;

/**
 *
 * @author CDAC
 */
public class Student {
        
    private int rollNumber;
    private String studentName;
    private String emailID;
    private String mobileNumber;

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", studentName=" + studentName + ", emailID=" + emailID + ", mobileNumber=" + mobileNumber + '}';
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }   

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.DBops;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CDAC
 */
@Entity
@Table(name="student_details")
public class StudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rollnumber")
    private int rollNumber;
    
    @Column(name="studentname", length=50)
    private String studentName;
    
    @Column(name="emailid", length=50)
    private String emailID;

    @Column(name="mobile", length=10)
    private String mobileNumber;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.LAZY)    
    private StudentPassword stdPassword;
    
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<Book>();  
    
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }         
   
    
    @Override
    public String toString() {
        return "StudentEntity{" + "rollNumber=" + rollNumber + ", studentName=" + studentName + ", emailID=" + emailID + ", mobileNumber=" + mobileNumber + ", stdPassword=" + stdPassword.getPassword() + '}';
    }

    public StudentPassword getStdPassword() {
        return stdPassword;
    }

    public void setStdPassword(StudentPassword stdPassword) {
        this.stdPassword = stdPassword;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }   
    
}

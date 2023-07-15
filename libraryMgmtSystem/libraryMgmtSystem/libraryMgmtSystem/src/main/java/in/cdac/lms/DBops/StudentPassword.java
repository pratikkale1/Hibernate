/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.DBops;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author CDAC
 */
@Entity
@Table(name = "student_password")
public class StudentPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rollnumber")
    private int rollNumber;

    @Override
    public String toString() {
        return "StudentPassword{" + "rollNumber=" + rollNumber + ", password=" + password + '}';
    }
    
    @Column(name="password", length = 16, nullable = false)
    private String password;

    @OneToOne
    @MapsId
    private StudentEntity student;

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }
    
    
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

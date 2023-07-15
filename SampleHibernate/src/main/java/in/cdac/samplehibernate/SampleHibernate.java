/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package in.cdac.samplehibernate;

import in.cdac.samplehibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author CDAC
 */
public class SampleHibernate {
    
    public static void main(String[] args) {
        SessionFactory sf = null;
        Session session = null;
        Transaction tns = null;
        
        Student std1 = new Student();
        std1.setStudentName("Varun");
        std1.setEmailID("varun@cdac.in");
        std1.setMobileNumber("1234567890");
        
        Student std2 = new Student();
        std2.setStudentName("Kiran");
        std2.setEmailID("kiran@cdac.in");
        std2.setMobileNumber("1234567890");
        
        sf = HDBUtil.getSessionFactory();
        session = sf.openSession();
        tns = session.beginTransaction();
        
        session.save(std1);
       // session.save(std2);               
        tns.commit();
        session.close();
        System.out.println(std1.getStudentName()+"=== Roll Number =="+std1.getRollNumber());
        //System.out.println(std2.getStudentName()+"=== Roll Number =="+std2.getRollNumber());
        System.out.println("===Object saved in the database -==");
    }
}

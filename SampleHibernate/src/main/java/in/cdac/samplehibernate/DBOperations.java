/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.samplehibernate;

import in.cdac.samplehibernate.model.Student;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author CDAC
 */
public class DBOperations {
    
    SessionFactory sf = null;
    Session session = null;
    Transaction tns = null;
    
    public DBOperations(){
        sf = HDBUtil.getSessionFactory();        
    }
    
    public int saveStudent(Student std){                 
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            session.save(std);
            tns.commit();                
        }
        catch(HibernateException he){
            he.printStackTrace();
        } finally{
            if(session != null){
                session.close();      
            }
        }
        return std.getRollNumber();
    }
    
    public List<Student> getAllStudentDetails() {
        List<Student> list = null;
        try {
            session = sf.openSession();            
            list = session.createQuery("from Student").list();
            for (Student std : list) {
                System.out.println(std.toString());
            }
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return list;
    }
    
    public Student getStudentByRollNumber(int rollnumber){ 
        Student std1 = null;
        try {
            session = sf.openSession();
            std1 = session.get(Student.class, rollnumber);
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return std1;
    }
    
    public void updateStudentDetails(Student updateStd){ 
         Student std1 = null;
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            std1 = session.get(Student.class, updateStd.getRollNumber()); // from the database

            std1.setEmailID(updateStd.getEmailID());
            std1.setMobileNumber(updateStd.getMobileNumber());
            std1.setStudentName(updateStd.getStudentName());

            session.update(std1);
            tns.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    public String deleteStudentByRollNumber(int rollnumber) {
        Student std1 = null;
        String status = "fail";
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            std1 = session.get(Student.class, rollnumber);
            if(std1 != null){
                session.delete(std1);
                status = "success";
            }else{
                return "doesn't exists";
            }                       
            tns.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            return status;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return status;
    }
}

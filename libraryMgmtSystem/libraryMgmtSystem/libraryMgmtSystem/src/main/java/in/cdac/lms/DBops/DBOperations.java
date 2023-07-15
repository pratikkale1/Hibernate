/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.DBops;

/**
 *
 * @author CDAC
 */
import in.cdac.lms.config.HibernateUtility;
import in.cdac.lms.model.Student;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author CDAC
 */
public class DBOperations {
    
    SessionFactory sf = null;
    Session session = null;
    Transaction tns = null;
    
    public DBOperations(){
        sf = HibernateUtility.getSessionFactory();        
    }
    
    public int saveStudent(StudentEntity std){                 
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            //session.persist(std);
            System.out.println("---"+session.save(std));
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
    
    
    public long saveBook(Book bk){                 
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            System.out.println("---"+session.save(bk));
            tns.commit();                
        }
        catch(HibernateException he){
            he.printStackTrace();
        } finally{
            if(session != null){
                session.close();      
            }
        }
        return bk.getBookID();
    }
    
    public List<StudentEntity> getAllStudentDetails() {
        List<StudentEntity> list = null;
        try {
            session = sf.openSession();            
            list = session.createQuery("from Student").list();
            for (StudentEntity std : list) {
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
    
    public StudentEntity getStudentByRollNumber(int rollnumber){ 
        StudentEntity std1 = null;
        try {
            session = sf.openSession();
            std1 = session.get(StudentEntity.class, rollnumber);
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return std1;
    }
    
     public Book getBookByID(long bookid){ 
        Book bk = null;
        try {
            session = sf.openSession();
            bk = session.get(Book.class, bookid);
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return bk;
    }
    
    public void updateStudentDetails(StudentEntity updateStd){ 
         StudentEntity std1 = null;
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            Query qry = session.createQuery("update StudentEntity set studentName=:sname,"
                    + "emailID=:email, mobileNumber=:mobile where rollNumber=:rno");
            qry.setParameter("sname", "abc");
            qry.setParameter("email", "abc@cdac.in");
            qry.setParameter("mobile", "1234567890");
            qry.setParameter("rno", "9");
            qry.executeUpdate();
            
//            std1 = session.get(StudentEntity.class, updateStd.getRollNumber()); // from the database
//
//            std1.setEmailID(updateStd.getEmailID());
//            std1.setMobileNumber(updateStd.getMobileNumber());
//            std1.setStudentName(updateStd.getStudentName());

            session.update(updateStd);
            tns.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    
    
    public void updateBookDetails(Book bk){          
        try {
            session = sf.openSession();
            tns = session.beginTransaction();
            session.update(bk);
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
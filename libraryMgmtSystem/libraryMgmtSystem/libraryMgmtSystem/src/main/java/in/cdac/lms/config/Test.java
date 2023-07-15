/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.config;

import in.cdac.lms.DBops.Book;
import in.cdac.lms.DBops.DBOperations;
import in.cdac.lms.DBops.StudentEntity;
import in.cdac.lms.DBops.StudentPassword;
import in.cdac.lms.model.Student;
import java.util.List;

/**
 *
 * @author CDAC
 */
public class Test {
    public static void main(String[] args) {
        StudentEntity std1 = new StudentEntity();
        std1.setStudentName("Manesh");
        std1.setMobileNumber("1234567890");
        std1.setEmailID("Manesh@cdac.in");


           StudentEntity std2 = new StudentEntity();
           std2.setStudentName("kumar");
           std2.setEmailID("kumar@cdac.in");
           std2.setMobileNumber("1234567890");
           
           StudentPassword spwd1 = new StudentPassword();
           spwd1.setPassword("cdac@123");
             
           StudentPassword spwd2 = new StudentPassword();
           spwd2.setPassword("cdac@12345");
           
           std1.setStdPassword(spwd1);
           std2.setStdPassword(spwd2);
           
           spwd1.setStudent(std1);
           spwd2.setStudent(std2);
           
           DBOperations dbops = new DBOperations(); 
//            Book book1 = new Book();
//            book1.setBookName("Hibernate");
//            book1.setAuthor("Gaven King");
//            book1.setYear(2006);
//            
//            Book book2 = new Book();
//            book2.setBookName("Java");
//            book2.setAuthor("Stallings");
//            book2.setYear(1995);
//            
//            Book book3 = new Book();
//            book3.setBookName("Mysql");
//            book3.setAuthor("Author");
//            book3.setYear(1995);
            
        //    dbops.saveStudent(std1);
        
            StudentEntity sd = dbops.getStudentByRollNumber(9);
            
            Book bk = dbops.getBookByID(3);
            
            System.out.println(bk.getBookName()+"===="+bk.getStudent().getStudentName());
//            bk.setStudent(sd);
//            //sd.getBooks().add(bk);
//            
//            dbops.updateBookDetails(bk);
            
            
           // dbops.saveStudent(std2);
            
//            dbops.saveBook(book1);
//            dbops.saveBook(book2);
//            dbops.saveBook(book3);
            
//            StudentEntity sd = dbops.getStudentByRollNumber(7);            
//            Book bk1 = dbops.getBookByID(5);  
////            
//            sd.getBooks().add(bk1);
////            
//            dbops.updateStudentDetails(sd);
            
            

//            System.out.println(""+sd.getBooks());
//            List<Book> bks = sd.getBooks();
//            for(Book bk : bks){
//                System.out.println(sd.getStudentName()+""+bk.getBookName());
//            }
            
           //dbops.saveStudent(std1);
           //dbops.saveStudent(std2);
           
           //StudentEntity sd = dbops.getStudentByRollNumber(1);
           //StudentPassword spwd = sd.getStdPassword();           
           
//           StudentPassword spwd;
//           spwd.getStudent().getStudentName();
           
//           System.out.println("=="+spwd.getPassword());
           
           
//            Book book = new Book();
//            book.setBookName("Hibernate");
//            book.setAuthor("Gaven King");
//            book.setYear(2006);
            
           
            
         
        
        
        //StudentEntity std1 = dbops.getStudentByRollNumber(1);
        //System.out.println(std1.toString());
        
        //StudentEntity std1 = dbops.getStudentByRollNumber(1);
        
//        Book book = new Book();
//        book.setBookName("Hibernate");
//        book.setAuthor("Gaven King");
//        book.setYear(2006);
//        
//        dbops.saveBook(book);
        
         
          
          
          
        

        
        
        
        
        
    }
}

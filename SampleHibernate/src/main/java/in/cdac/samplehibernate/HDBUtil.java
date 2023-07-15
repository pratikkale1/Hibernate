/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.samplehibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author CDAC
 */
public class HDBUtil {
    
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        sessionFactory = new Configuration().configure()
                .buildSessionFactory();        
        return sessionFactory;
    }      
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.lms.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author CDAC
 */
public class HibernateUtility {
   
   private static SessionFactory sf;
   
   public static SessionFactory getSessionFactory(){
      sf = new Configuration().configure().buildSessionFactory();
      return sf;
   }
}

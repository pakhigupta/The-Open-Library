
package hib;

import org.hibernate.Session;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DAOLayer {

    private static SessionFactory sessionFactory;
    
    static {
        try {
            Configuration cfg=new Configuration();
           // cfg.addAnnotatedClass(EmployeeManagement.class);
            //cfg.addAnnotatedClass(student.class);
            cfg.configure();
            sessionFactory=cfg.buildSessionFactory();
           // sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public  static  Session getSession()
    {
        return sessionFactory.openSession();
    }
}

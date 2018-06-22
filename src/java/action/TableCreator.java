package action;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import tables.book_collection;
import tables.login;

//import tables.EmployeeManagement;

public class TableCreator {
    public static void main(String[] args) {
      
  
        Configuration cfg=new Configuration();
         cfg.addAnnotatedClass(book_collection.class);
        cfg.addAnnotatedClass(login.class);
        
        
        cfg.configure();
        SchemaExport se=new SchemaExport(cfg);
        se.create(true,true);
        System.out.println("Table Created.");
    }
    
}

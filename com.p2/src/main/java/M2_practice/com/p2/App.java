package M2_practice.com.p2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
//        
        SessionFactory factory=cfg.buildSessionFactory();
       // SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
    }
}

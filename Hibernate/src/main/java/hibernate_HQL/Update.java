package hibernate_HQL;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.*;

public class Update {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(PremierLeague.class)
				.buildSessionFactory();
		Session s = sf.getCurrentSession();
		try {
			s.beginTransaction();
			s.createQuery("update PremierLeague set pts=12 where team='Chelsea'").executeUpdate();
			List<PremierLeague> l = s.createQuery("from PremierLeague").getResultList();
			for (PremierLeague p : l) {
				System.out.println(p);
			}
		} finally {
			s.close();
			sf.close();
		}
	}
}

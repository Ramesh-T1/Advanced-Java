package hibernate_HQL;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectAll {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").
				          addAnnotatedClass(PremierLeague.class).buildSessionFactory();
		Session s=sf.getCurrentSession();
		try
		{
			//BeginTransaction
			s.beginTransaction();
			//Query
			List<PremierLeague> l=s.createQuery("from PremierLeague").getResultList();
			for (PremierLeague ent : l) {
				System.out.println(ent);
			}
		}
		finally
		{
			sf.close();
			s.close();
		}

	}

}

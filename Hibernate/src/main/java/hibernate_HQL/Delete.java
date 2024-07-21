package hibernate_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(PremierLeague.class)
				          .buildSessionFactory();
		Session s=sf.getCurrentSession();
		try
		{
			s.beginTransaction();
			s.createQuery("delete from PremierLeague where team='Wolves' or team='Man UTD'").executeUpdate();
			List<PremierLeague> e=s.createQuery("from PremierLeague").getResultList();
			for(PremierLeague d:e)
			{
				System.out.println(d);
			}
		}
		finally
		{
			s.close();
			sf.close();
		}

	}

}

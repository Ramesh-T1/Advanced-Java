package hibernate_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").
		          addAnnotatedClass(PremierLeague.class).buildSessionFactory();
        Session s=sf.getCurrentSession();
  try
  {
	//BeginTransaction
	s.beginTransaction();
	//Query
	s.createQuery("Insert into PremierLeague (srno,team,pts,pos) values (11,'Burnley',11,10)").executeUpdate();
	List<PremierLeague> l=s.createQuery("from PremierLeague").getResultList();
	for (PremierLeague ent : l) {
		System.out.println(ent);
	}
	s.getTransaction().commit();
  }
finally
{
	sf.close();
	s.close();
}

	}

}

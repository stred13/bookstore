package config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class hibSessionFactory {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory buildSessionFactory() {
		try {
			registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        MetadataSources sources = new MetadataSources(registry);
	        Metadata metadata = sources.getMetadataBuilder().build();
	        sessionFactory = metadata.getSessionFactoryBuilder().build();	       
		}catch(Throwable e) {
			shutdown();
			throw new ExceptionInInitializerError(e);
			//e.getStackTrace();
		}

		return sessionFactory;
	}
	
	public static SessionFactory getSession() {
		SessionFactory sessionF = buildSessionFactory();
		return sessionF;
	}
	
	public static void shutdown() {
		if(registry!=null)
			StandardServiceRegistryBuilder.destroy(registry);
	}
	
}


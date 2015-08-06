import bean.UserDetails;
import bean.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String args[]) {

        UserDetails user = new UserDetails();
        user.setUserName("Third User");

        Vehicle vehicle = new Vehicle();
        vehicle.setVin("HUANG123456");

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(user);
        session.save(vehicle);
        session.getTransaction().commit();

        session.close();
    }
}
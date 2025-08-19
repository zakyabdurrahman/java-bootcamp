import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class Main {

    public static void main(String[] args) {
        //make a hibernate session (using sessionFactory)
        Session ses = Main.setupHibernate();
        Car mercedes = new Car("Mercedes S-Class", 2010, 2_000_000);
        Car existingCar = null;
        Car carUpdate = new Car();
        carUpdate.setCarId(1)
                .setCarName("Mazda RX-8")
                .setCarYear(2010);
        Transaction tran = ses.beginTransaction();
        //in version 7 use persist instead of save to persist an object to db
        //ses.persist(mercedes);
        //for update use merge (get existing db row to persistence, then modify it, then
        //flush the session
        ses.merge(carUpdate);
        tran.commit();
        System.out.println("new Data Saved");

        //in hibernate we save data always with transaction
        //how to get an object from db (the entity class, the primary key)
        Car result = ses.find(Car.class, 1);
        System.out.println(result.getCarName());
    }
    //this is from the hibernate docs
    static private Session setupHibernate() {
        //this build the configs
        final Configuration cfg = new Configuration();
        //add our classes here using chaining
        cfg.addAnnotatedClass(Car.class);

        try {
            //build the session factory with the above config
            //configure method call to load hibernate.cfg.xml (in res folder)
            SessionFactory sf = cfg.configure().buildSessionFactory();
            //open a db session

            return sf.openSession();

        } catch (Exception e) {

            return null;
        }
    }
}

package abstractfactory.example.database.dbfactories;

import abstractfactory.example.database.queries.Query;
import abstractfactory.example.database.transactions.Transaction;

public interface DbAbstractFactory {
    public Query createQuery();
    public Transaction createTransaction();
}

/*
public abstract class DbAbstractFactory {
    public abstract Query createQuery();
    public Transaction createTransaction();

    // - The primary responsibility of DbAbstractFactory isn't only to create objects via its child classes (MySqlDbFactory/MongoDbFactory).
    // - DbAbstractFactory can have its own concrete methods satisfying other business logic (like sendBirthdayWishes(int id))
    // that relies on the objects returned by factory methods (here createQuery() in abstract class DbAbstractFactory).
    // - Subclasses (MySqlDbFactory/MongoDbFactory) can indirectly change that business logic by
    // overriding the factory method and returning a different type of product from it.
    // - In that case, make DbAbstractFactory as an abstract class instead of interface
    // to have some default behavior other than factory methods.
    public void sendBirthdayWishes(int id) {
        System.out.println("Entered sendBirthdayWishes() method");
        Query query = createQuery();
        if (query.isUserPresent(id)) {
            System.out.println("Happy Birthday Dear! May you gain Super Natural Powers like Shaktiman this year!");
        }
        System.out.println("Leaving sendBirthdayWishes() method");
    }
}
*/
package factory.example.database.solution.dbfactories;

import factory.example.database.solution.queries.Query;

public interface DbFactory {
    public Query createQuery();
}

/*
public abstract class DbFactory {
    public abstract Query createQuery();

    // - The primary responsibility of DbFactory isn't only to create objects via its child classes (MySqlDbFactory/MongoDbFactory).
    // - DbFactory can have its own concrete methods satisfying other business logic (like sendBirthdayWishes(int id))
    // that relies on the objects returned by factory methods (here createQuery() in abstract class DbFactory).
    // - Subclasses (MySqlDbFactory/MongoDbFactory) can indirectly change that business logic by
    // overriding the factory method and returning a different type of product from it.
    // - In that case, make DbFactory as an abstract class instead of interface
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
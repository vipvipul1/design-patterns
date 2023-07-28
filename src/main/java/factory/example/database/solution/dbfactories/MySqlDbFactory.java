package factory.example.database.solution.dbfactories;

import factory.example.database.solution.queries.MySqlQuery;
import factory.example.database.solution.queries.Query;

// uncomment this together with the commented code in abstract class DbFactory.
//public class MySqlDbFactory extends DbFactory {
public class MySqlDbFactory implements DbFactory {
    // Factory Method implementations below should keep track of objects created
    // and shouldn't create objects each time this method is called.
    //1. First, you need to create some storage to keep track of all the created objects.
    //2. When someone requests an object, the program should look for a free object inside that pool.
    //3. … and then return it to the client code.
    //4. If there are no free objects, the program should create a new one (and add it to the pool).
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
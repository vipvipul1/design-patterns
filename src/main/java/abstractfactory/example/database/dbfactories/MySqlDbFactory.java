package abstractfactory.example.database.dbfactories;

import abstractfactory.example.database.queries.MySqlQuery;
import abstractfactory.example.database.queries.Query;
import abstractfactory.example.database.transactions.MySqlTransaction;
import abstractfactory.example.database.transactions.Transaction;

// uncomment this together with the commented code in abstract class DbAbstractFactory.
//public class MySqlDbFactory extends DbAbstractFactory {
public class MySqlDbFactory implements DbAbstractFactory {
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

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}


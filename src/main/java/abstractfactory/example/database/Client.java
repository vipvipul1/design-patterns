package abstractfactory.example.database;

import abstractfactory.example.database.dbfactories.DbAbstractFactory;
import abstractfactory.example.database.dbfactories.MongoDbFactory;
import abstractfactory.example.database.dbfactories.MySqlDbFactory;
import abstractfactory.example.database.queries.Query;
import abstractfactory.example.database.transactions.Transaction;

public class Client {
    public static void main(String[] args) {
        // - Here our use of database is not tightly coupled with MySqlDbFactory only.
        // - Adding a new database like MongoDbFactory will require us to just change the MySqlDbFactory() to MongoDbFactory()
        // and all other factory method calls will work fine with help of runtime polymorphism.
        DbAbstractFactory db = new MySqlDbFactory();
//        DbAbstractFactory db = new MongoDbFactory();

        // Uncomment this together with the commented code in abstract class DbAbstractFactory.
//        db.sendBirthdayWishes(2);

        Query query = db.createQuery();
        if (query.isUserPresent(2)) {
            Transaction transaction = db.createTransaction();
            transaction.startTransaction();

            query.updateUserAddress(2, "Bangalore");

            transaction.executeTransaction();
            transaction.endTransaction();
        }
    }
}

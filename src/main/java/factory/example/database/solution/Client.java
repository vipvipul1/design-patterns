package factory.example.database.solution;

import factory.example.database.solution.dbfactories.DbFactory;
import factory.example.database.solution.dbfactories.MongoDbFactory;
import factory.example.database.solution.dbfactories.MySqlDbFactory;
import factory.example.database.solution.queries.Query;

public class Client {
    public static void main(String[] args) {
        // - Here our use of database is not tightly coupled with MySqlDbFactory only.
        // - Adding a new database like MongoDbFactory will require us to just change the MySqlDbFactory() to MongoDbFactory()
        // and all other factory method calls will work fine with help of runtime polymorphism.
        DbFactory db = new MySqlDbFactory();
//        DbFactory db = new MongoDbFactory();

        // Uncomment this together with the commented code in abstract class DbFactory.
//         db.sendBirthdayWishes(2);

        Query query = db.createQuery();
        if (query.isUserPresent(2)) {
            query.updateUserAddress(2, "Bangalore");
        }
    }
}

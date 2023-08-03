package factory.example.database.solution;

import factory.example.database.solution.dbfactories.DbFactory;
import factory.example.database.solution.dbfactories.MongoDbFactory;
import factory.example.database.solution.dbfactories.MySqlDbFactory;
import factory.example.database.solution.queries.Query;

public class Client {
    public static void main(String[] args) {
        // - Here our use of database is not tightly coupled with MySqlDbFactory only.
        // - Adding a new database like MongoDbFactory will require us to just change the userRequestDb to "Mongo"
        // and all other factory method calls will work fine with help of runtime polymorphism.
        String userRequestDb = "Mongo";
//        String userRequestDb = "MySql";
        DbFactory db = getDbFactory(userRequestDb);

        // Uncomment this together with the commented code in abstract class DbFactory.
//         db.sendBirthdayWishes(2);

        Query query = db.createQuery();
        if (query.isUserPresent(2)) {
            query.updateUserAddress(2, "Bangalore");
        }
    }

    public static DbFactory getDbFactory(String userRequestDb) {
        DbFactory dbFactory = null;
        if ("MySql".equals(userRequestDb)) {
            dbFactory = new MySqlDbFactory();
        } else if ("Mongo".equals(userRequestDb)) {
            dbFactory = new MongoDbFactory();
        }
        return dbFactory;
    }
}

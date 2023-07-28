package factory.example.database.problem;

import factory.example.database.problem.db.MySqlDatabase;
import factory.example.database.problem.query.MySqlQuery;

public class Client {
    public static void main(String[] args) {
        // Here our use of database is tightly coupled with MySqlDbFactory only.
        // Adding a new database like MongoDbFactory will require us to change all the places
        // where specific MySqlXXXXX objects are used.
        MySqlDatabase db = new MySqlDatabase();
        MySqlQuery query = db.createQuery();
        if (query.isUserPresent(2)) {
            query.updateUserAddress(2, "Bangalore");
        }
    }
}

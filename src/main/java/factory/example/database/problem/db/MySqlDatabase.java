package factory.example.database.problem.db;

import factory.example.database.problem.query.MySqlQuery;

public class MySqlDatabase {
    public MySqlQuery createQuery() {
        return new MySqlQuery();
    }

}

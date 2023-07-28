package factory.example.database.problem.query;

public class MySqlQuery {
    public boolean isUserPresent(int id) {
        System.out.println("MySQL: User found with id: " + id);
        return true;
    }

    public boolean updateUserAddress(int id, String address) {
        System.out.println("MySQL: Updated Address of User with id: " + id);
        return true;
    }
}

package factory.example.database.solution.queries;

public class MySqlQuery implements Query {
    @Override
    public boolean isUserPresent(int id) {
        System.out.println("MySQL: User found with id: " + id);
        return true;
    }

    @Override
    public boolean updateUserAddress(int id, String address) {
        System.out.println("MySQL: Updated Address of User with id: " + id);
        return true;
    }
}

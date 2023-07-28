package abstractfactory.example.database.queries;

public class MySqlQuery implements Query {
    @Override
    public boolean isUserPresent(int id) {
        System.out.println("MySql: User found with id: " + id);
        return true;
    }

    @Override
    public boolean updateUserAddress(int id, String address) {
        System.out.println("MySql: Updated Address of User with id: " + id);
        return true;
    }
}

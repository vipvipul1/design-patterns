package abstractfactory.example.database.queries;

public class MongoQuery implements Query {
    @Override
    public boolean isUserPresent(int id) {
        System.out.println("Mongo: User found with id: " + id);
        return true;
    }

    @Override
    public boolean updateUserAddress(int id, String address) {
        System.out.println("Mongo: Updated Address of User with id: " + id);
        return true;
    }
}

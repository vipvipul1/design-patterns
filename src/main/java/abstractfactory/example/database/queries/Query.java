package abstractfactory.example.database.queries;

public interface Query {
    public boolean isUserPresent(int id);
    public boolean updateUserAddress(int id, String address);
}

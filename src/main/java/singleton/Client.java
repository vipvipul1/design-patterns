package singleton;

public class Client {
    public static void main(String[] args) {
        DbConnection dbConnection1 = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();
        System.out.println(dbConnection1 == dbConnection2);
    }
}

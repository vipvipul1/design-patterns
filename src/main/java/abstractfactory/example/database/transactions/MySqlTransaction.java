package abstractfactory.example.database.transactions;

public class MySqlTransaction implements Transaction {
    @Override
    public void startTransaction() {
        System.out.println("MySql: Transaction started");
    }

    @Override
    public void executeTransaction() {
        System.out.println("MySql: Transaction executed");
    }

    @Override
    public void endTransaction() {
        System.out.println("MySql: Transaction ended");
    }
}

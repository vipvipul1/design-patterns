package abstractfactory.example.database.transactions;

public class MongoTransaction implements Transaction {
    @Override
    public void startTransaction() {
        System.out.println("Mongo: Transaction started");
    }

    @Override
    public void executeTransaction() {
        System.out.println("Mongo: Transaction executed");
    }

    @Override
    public void endTransaction() {
        System.out.println("Mongo: Transaction ended");
    }
}

package abstractfactory.example.database.transactions;

public interface Transaction {
    public void startTransaction();
    public void executeTransaction();
    public void endTransaction();

}

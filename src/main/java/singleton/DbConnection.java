package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnection {
    private static DbConnection dbConnection;
    private static Lock lock = new ReentrantLock();

    private DbConnection() {}

    // We can either use lock object or synchronized block
    public static DbConnection getInstance() {
        if (dbConnection == null) {
//            synchronized (DbConnection.class) {
            lock.lock();
                if (dbConnection == null) {
                    dbConnection = new DbConnection();
                }
//            }
            lock.unlock();
        }
        return dbConnection;
    }
}

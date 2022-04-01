package singleton;

public class DbSingletonLazy {
    private static volatile DbSingletonLazy instance = null;

    private DbSingletonLazy(){
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonLazy getInstance(){
        if(instance == null){
            synchronized (DbSingletonLazy.class) {
                // If another thread has a lock and it is creating a new class, this will not be executed again
                if (instance == null) {
                    instance = new DbSingletonLazy();
                }
            }
        }
        return instance;
    }

}

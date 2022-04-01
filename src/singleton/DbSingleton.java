package singleton;

public class DbSingleton {
    // Eager loader because it is being initialized regardless
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton(){}

    public static DbSingleton getInstance(){
        return instance;
    }


}

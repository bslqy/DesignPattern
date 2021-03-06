package singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        // Return the instance address
        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);
    }
}

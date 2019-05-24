package singleton;

/**
 * @author dawn
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {}

    public static synchronized Singleton3 getInstance() {
        return instance;
    }

}

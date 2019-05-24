package singleton;

/**
 * @author dawn
 */
public class Singleton7 {

    private static volatile Singleton7 instance;

    private Singleton7() {}

    public static Singleton7 getInstance() {
        if (null == instance) {
            synchronized (Singleton7.class) {
                if (null == instance) {
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }

}

package singleton;

/**
 * @author dawn
 */
public class Singleton6 {

    private static Singleton6 instance;

    private Singleton6() {}

    public static Singleton6 getInstance() {
        if (null == instance) {
            synchronized (Singleton6.class) {
                if (null == instance) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}

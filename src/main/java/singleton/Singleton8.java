package singleton;

/**
 * @author dawn
 */
public class Singleton8 {

    private static ThreadLocal<Singleton8> threadLocal = ThreadLocal.withInitial(Singleton8::new);

    private Singleton8() {}

    public static Singleton8 getInstance() {
        return threadLocal.get();
    }

}

package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author dawn
 */
public class Singleton9 {

    private static AtomicReference<Singleton9> reference = new AtomicReference<>();

    private Singleton9() {}

    public static Singleton9 getInstance() {
        for (;;){
            Singleton9 instance = reference.get();
            if (null != instance) {
                return instance;
            }
            instance = new Singleton9();
            if (reference.compareAndSet(null, instance)) {
                return instance;
            }
        }
    }

}

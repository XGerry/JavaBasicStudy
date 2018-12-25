package ThreadDemo;

import java.util.concurrent.TimeUnit;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/12/25
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}

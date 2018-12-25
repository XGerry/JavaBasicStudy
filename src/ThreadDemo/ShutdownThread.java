package ThreadDemo;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/12/25
 */
public class ShutdownThread {
    public static void main(String[] args) {
        Runner one = new Runner();
        Thread countThread = new Thread(one, "CountThread");
        countThread.start();
        // 睡眠2秒，main线程对CountThread进行中断，使CountThread能够感知中断而结束
        SleepUtils.second(2);
        countThread.interrupt();
        Runner two = new Runner();
        countThread = new Thread(two, "CountThread");
        countThread.start();
        // 睡眠2秒，main线程对Runner two进行取消，使CountThread能够感知on为false而结束
        SleepUtils.second(2);
        two.cancle();
    }

    public static class Runner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count =" + i);
        }

        public void cancle() {
            on = false;
        }
    }
}

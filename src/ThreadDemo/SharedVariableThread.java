package ThreadDemo;

/**
 * @author:Gerry
 * @description:多个线程之间共享变量线程不安全的情况
 * @date: Created in 2018/12/21
 */
public class SharedVariableThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + SharedVariableThread.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        SharedVariableThread thread = new SharedVariableThread();
        Thread a = new Thread(thread, "A");
        Thread b = new Thread(thread, "B");
        Thread c = new Thread(thread, "C");
        Thread d = new Thread(thread, "D");
        Thread e = new Thread(thread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

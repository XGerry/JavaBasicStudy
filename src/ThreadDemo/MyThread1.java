package ThreadDemo;

/**
 * @author:Gerry
 * @description:多个线程之间不共享变量线程安全的情况
 * @date: Created in 2018/12/21
 */
public class MyThread1 extends Thread {
    private int count = 5;

    public MyThread1(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + MyThread1.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1("A");
        MyThread1 thread2 = new MyThread1("B");
        MyThread1 thread3 = new MyThread1("C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

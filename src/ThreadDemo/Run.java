package ThreadDemo;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/12/20
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("MyThread运行结束！");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("MyRunnable运行结束");
    }
}

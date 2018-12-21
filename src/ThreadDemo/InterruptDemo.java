package ThreadDemo;

/**
 * @author:Gerry
 * @description:使用interrupt()方法终止线程
 * @date: Created in 2018/12/21
 */
public class InterruptDemo extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了!我要退出了!");
               // break;  //使用break无法停止线程
                return;  //使用return停止线程
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("看到这句话说明线程并未终止------");
    }

    public static void main(String[] args) {
        try {
            InterruptDemo thread = new InterruptDemo();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException ex) {
            System.out.println("main catch");
            ex.printStackTrace();
        }
    }
}

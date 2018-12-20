package ThreadDemo;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/12/20
 */
public class MyThread extends Thread {
    @Override
    public void run()
    {
        super.run();
        System.out.println("MyThread");
    }
}

public class TestThread {
    public static void main(String[] args) {
//        RunnableDemo runnableDemo=new RunnableDemo("Thread1");
//        runnableDemo.start();
//
//        RunnableDemo runnableDemo1=new RunnableDemo("Thread2");
//        runnableDemo1.start();

        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }
}

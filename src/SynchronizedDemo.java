public class SynchronizedDemo {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class)
        {
            System.out.println("Synchronize");
        }
    }
}

public class NumberGenerator  implements Runnable{
    private String name;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator("test a "));
        Thread thread2 = new Thread(new NumberGenerator("test b"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

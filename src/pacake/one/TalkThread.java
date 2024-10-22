package pacake.one;

public class TalkThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm talking");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}

package pacake.one;

public class IncThread extends Thread{

    private volatile int i;

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            this.i++;
        }
        System.out.println(i);
    }
}

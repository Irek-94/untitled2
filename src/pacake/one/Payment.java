package pacake.one;

import java.util.Scanner;

public class Payment {

    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public synchronized void doPayment(){

        try {


            System.out.println("Start payment");
            while (amount <= 0) {
                this.wait();
            }
            close = true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Payment is closed: " + close);
    }

    public void initAmount(){
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
    }
}

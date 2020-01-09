package Zad1;

class MyThreads implements Runnable {
    private String name;
    boolean get_cash;
    private Account account;
    Thread t;

    public MyThreads(String name, boolean get_cash, Account account) {
        this.name = name;
        this.get_cash = get_cash;
        this.account = account;
        t = new Thread(this, name);

        System.out.println("New thread:" + Thread.currentThread().getName());
        t.start();
    }

    public void run() {
        System.out.println("\n" + name + " is running..");

        while (true) {
            int amount = get_cash ? (account.getAmount()-10) : (account.getAmount()+10);
            account.setAmount(amount);

            System.out.println(t.getName() + ": " + account.getAmount());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } // void run()
} // class Zad1.MyThreads


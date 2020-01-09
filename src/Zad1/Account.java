package Zad1;

class Account {
    private int amount = 1000;

    public int getAmount() {
        synchronized (Account.class) {
            return amount;
        }
    }

    public void setAmount(int amount) {
        synchronized (Account.class) {
            this.amount = amount;
        }
    }
}

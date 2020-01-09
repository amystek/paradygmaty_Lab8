package Zad1;

class Marriage {

    public static void main(String args[]) {
        Account account = new Account();
        new MyThreads("wife", true, account);
        new MyThreads("husband", false, account);
    }

}
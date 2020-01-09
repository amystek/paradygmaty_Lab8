package Philosophers;

public class Eat {

    public static void main(String args[]) {
        Table table = new Table(5);
        new Philosopher(0, table);
        new Philosopher(1, table);
        new Philosopher(2, table);
        new Philosopher(3, table);
        new Philosopher(4, table);

        System.out.println("Koniec programu - komunikat testowy..\n");
    }

}

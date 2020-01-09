package Philosophers;

public class Philosopher implements Runnable {
    int philosopher_no;
    int dinners_count;
    Table table;
    Thread t;

    @Override
    public void run() {
        boolean left, right;

        while (true) {
            int left_fork_no, right_fork_no;
            if ((philosopher_no+1)%4 != 0) {
                left_fork_no = philosopher_no;
                right_fork_no = (philosopher_no + 1) % 4;
            }
            else {
                left_fork_no = (philosopher_no + 1) % 4;
                right_fork_no = philosopher_no;
            }

            left = table.getFork(left_fork_no);
            if (left) {
                right = table.getFork(right_fork_no);
                if (left & right) dinners_count++;

                table.leaveFork(left_fork_no);
                table.leaveFork(right_fork_no);
            }
            else table.leaveFork(left_fork_no);

            System.out.println("Filozof " + philosopher_no + "(licznik obiadów): " + dinners_count);
            int sleep_time = 500 + (int) Math.random()*1000;
            try {
                Thread.sleep(sleep_time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // while
    } // run()

    private void eat_dinner () {
        dinners_count++;
    }

    public Philosopher(int philosper_no, Table table) {
        this.philosopher_no = philosper_no;
        this.table = table;
        dinners_count = 0;
        t = new Thread(this);

        t.start();
    }
}

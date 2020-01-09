package Philosophers;

public class Table {
    private int philosopher_count;
    private boolean[] fork_taken;

    public Table(int philosopher_count) {
        this.philosopher_count = philosopher_count;
        fork_taken = new boolean[philosopher_count];
        for (int i=0; i<philosopher_count;i++)
            fork_taken[i] = false;
    }

    public synchronized boolean getFork(int fork_no) {
        if (fork_taken[fork_no] == false) {
            fork_taken[fork_no] = true;
            return true;
        }

        return false;
    }

    public void leaveFork(int fork_no) {
        fork_taken[fork_no] = false;
    }

}

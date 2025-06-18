package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int STACK_CAPACITY = 12;
    private static final int DEFAULT_VALUE = -1;
    //wszystkie atrybuty podlegają hermetyzacji

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
        //getter z polecenia 10, dodałem go w poleceniu 9
    }

    public int[] getNumbers() {
        return numbers.clone();
    }
}

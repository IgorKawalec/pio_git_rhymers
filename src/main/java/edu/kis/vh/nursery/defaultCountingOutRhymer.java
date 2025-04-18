package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_VALUE = -1;
    private static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }
        
    public boolean isFull() {
        return total == CAPACITY - 1;
    }
        
    protected int peekaboo() {
        if (callCheck()) return DEFAULT_VALUE;
        return numbers[total];
    }
            
    public int countOut() {
        if (callCheck()) return DEFAULT_VALUE;
        return numbers[total--];
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getEmptyValue() {
        return EMPTY_VALUE;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

}

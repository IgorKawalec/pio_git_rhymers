package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

int totalRejected = 0;

    private int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
    if (!callCheck() && in > peekaboo())
            totalRejected++;
            else
                super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int tr) {
        totalRejected = tr;
    }
}

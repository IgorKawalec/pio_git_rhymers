package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private final static int IS_EMPTY = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node next=last.getNext();
            next = new Node(i);
            Node previous=next.getPrev();
            previous = last;
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return IS_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}

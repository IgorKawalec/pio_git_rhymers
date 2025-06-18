package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private final static int IS_EMPTY = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.previous = getLast();
            last = getLast().next;
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
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return IS_EMPTY;
        int ret = last.value;
        last = last.previous;
        return ret;
    }

    public Node getLast() {
        return last;
    }
}

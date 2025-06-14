package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    int counter;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.previous = last;
            last = last.next;
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
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.previous;
        return ret;
    }

    public Node getLast() {
        return last;
    }
}

package edu.kis.vh.nursery.list;

public class Node {

    final int value;
    Node previous, next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return previous;
    }

    public Node getNext() {
        return next;
    }
}

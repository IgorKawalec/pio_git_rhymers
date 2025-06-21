package edu.kis.vh.nursery.list;

/**
 * Represents a node in a doubly linked list structure used by IntLinkedList.
 * Stores an integer value and references to the previous and next nodes.
 *
 * @author
 */
public class Node {

    /**
     * The integer value stored in this node.
     */
    final private int value;

    /**
     * Reference to the previous and next node in the list.
     */
    private Node previous, next;

    /**
     * Constructs a new Node with the specified integer value.
     *
     * @param i the value to be stored in the node
     */
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

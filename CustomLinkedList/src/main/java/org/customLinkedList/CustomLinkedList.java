package org.customLinkedList;

public class CustomLinkedList {

    private int size = 0;
    private Node head;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.setNext(this.head);
        head = node;
        this.size += 1;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {
        if (tail == null) {
            this.insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.setNext(node);
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index > size)
        {
            throw new IllegalArgumentException("Invalid index value");
        }
        if (index == 0) {
            this.insertFirst(value);
            return;
        }
        if (index == size)
        {
            this.insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.getNext();
        }
        Node node = new Node(value, temp.getNext());
        temp.setNext(node);
        size++;
    }

    public int deleteFirst() {
        int value = head.getValue();
        head = head.getNext();
        return value;
    }

    public void display() {
        Node displayItem = head;
        while (displayItem != null) {
            System.out.print(displayItem.getValue() + " -> ");
            displayItem = displayItem.getNext();
        }
        System.out.println("End");
    }
}

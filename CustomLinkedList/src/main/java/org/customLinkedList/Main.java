package org.customLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomLinkedList cl = new CustomLinkedList();
        cl.insertFirst(4);
        cl.insertFirst(6);
        cl.insertFirst(9);
        cl.insertLast(99);
        cl.insert(10, 2);
        cl.display();
        System.out.println(cl.deleteFirst());
        cl.display();
    }
}
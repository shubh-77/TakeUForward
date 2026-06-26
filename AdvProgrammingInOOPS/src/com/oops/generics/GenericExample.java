package com.oops.generics;

import java.util.ArrayList;
import java.util.List;

//Generic class
public class GenericExample<T> {

    public List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void removeLast(T element) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            list.remove(list.size() - 1);
        }

    }

    public T getElement(int index) {
        return list.get(index);
    }

    public void printList() {
        System.out.println("Printing list...");
        for (T t : list) {
            System.out.println(t);
        }
    }

    // Generic method
    public static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        GenericExample<Integer> myList = new GenericExample<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        myList.printList();

        System.out.println();
        myList.getElement(1);

    }
}

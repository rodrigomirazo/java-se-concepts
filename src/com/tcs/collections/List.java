package com.tcs.collections;

import java.util.*;

public class List<T extends Person> {

    static ArrayList<String>   arrayList   = new ArrayList<>();
    static LinkedList<String>  linkedList  = new LinkedList<String>();
    static Vector<String>      vector      = new Vector<String>();
    static Stack<String>       stack       = new Stack<String>();

    static HashSet<String> hashSet   = new HashSet<>();

    public static void main(String[] args) {

    }

    public static void ArrayListCRUD() {

        arrayList.add("element 1");
        arrayList.add("element 2");
        arrayList.add("element 3");
        System.out.println("Print List: " + arrayList.toString());

        arrayList.remove(2);
        System.out.println("Print List: " + arrayList.toString());

        arrayList.set(0, "element updated");
        System.out.println("Print List: " + arrayList.toString());

        arrayList.forEach(s -> {

        });
    }

    public static void LinkedListCRUD() {
        linkedList.add("element 1");
        linkedList.add("element 2");
        linkedList.add("element 3");
        System.out.println("Print List: " + linkedList.toString());

        linkedList.remove(2);
        System.out.println("Print List: " + linkedList.toString());

        linkedList.set(0, "element updated");
        System.out.println("Print List: " + linkedList.toString());

        linkedList.forEach(s -> {

        });
    }

}

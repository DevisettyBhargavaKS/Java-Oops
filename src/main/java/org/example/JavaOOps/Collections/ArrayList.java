package org.example.JavaOOps.Collections;

public class ArrayList {
    public static void main(String[] args) {
        int n = 5;
        java.util.ArrayList<Integer> arr1 = new java.util.ArrayList<Integer>(n);
        java.util.ArrayList<Integer> arr2 = new java.util.ArrayList<Integer>();
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejempl;

import java.util.*;

/**
 *
 * @author lopez
 */
public class Ejempl {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));
        list.add(rnd.nextInt(100));

        list.remove(0);// Remove first element

        Imprimir(list);

        bubbleSort(list);

        Imprimir(list);

        list.clear();

        Imprimir(list);

    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = list.get(minIdx);
            list.set(minIdx, list.get(i));
            list.set(i, temp);
        }
    }

    public static void insertionSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    public static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }

    public static void mergeSort(ArrayList<Integer> list, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(list, l, m);
            mergeSort(list, m + 1, r);
            merge(list, l, m, r);
        }
    }

    public static void merge(ArrayList<Integer> list, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        ArrayList<Integer> L = new ArrayList<>(n1);
        ArrayList<Integer> R = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            L.add(i, list.get(l + i));
        }
        for (int j = 0; j < n2; j++) {
            R.add(j, list.get(m + 1 + j));
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                list.set(k, L.get(i));
                i++;
            } else {
                list.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, R.get(j));
            j++;
            k++;
        }
    }

    public static int linearSearch(ArrayList<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == key) {
                return mid;
            } else if (list.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void Imprimir(ArrayList<Integer> list) {
//        int element = list.get(0); // Get first element

        int size = list.size();

        boolean contains = list.contains(10);
        System.out.println(list);
//        System.out.println(element);
        System.out.println(contains);
        System.out.println(size);
    }
}

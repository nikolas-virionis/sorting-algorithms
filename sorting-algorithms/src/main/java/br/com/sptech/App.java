package br.com.sptech;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] list = { 4, 2, 8, 7, 5 };
        System.out.println(Arrays.toString(Insertion.sort(list)));
    }
}

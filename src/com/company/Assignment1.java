package com.company;

public class Assignment1 {

    public static void main(String[] args) {

        int[] myArray = {5, 3, 7, 6, 2, 8};

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);

        System.out.println();

        for (int foreach : myArray)
            System.out.println(foreach);

        System.out.println();

        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }

        System.out.println();

        do {
            System.out.println(myArray[i]);
        } while (i < myArray.length);
        i++;
    }
}
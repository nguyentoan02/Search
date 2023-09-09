/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Library {

    public static int getInt(String mess) {
        Scanner sc = new Scanner(System.in);
        int size_Array = 0;
        String input;
        do {
            System.out.print(mess);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input couldn't be empty");
                continue;
            } else {
                size_Array = Integer.parseInt(input);
                break;
            }
        } while (true);
        return size_Array;
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
    }

    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

}

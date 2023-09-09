/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author MSII
 */
import Model.Element;
import Model.Library;
import controller.SearchProgramming;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        int size = library.getInt("Enter the number of elements in the array:");
        int[] array = library.createArray(size);

        Element element = new Element(array, size);

        SearchProgramming searchProgram = new SearchProgramming(element);
        searchProgram.run();
    }
}

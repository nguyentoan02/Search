package controller;

import Model.Algorithm;
import Model.Element;
import Model.Library;
import View.Menu;

public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Binary Search", "Linear Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("\nSearch Option", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize();
        array = element.getArray();
        library.display(array); // Hiển thị dãy số trước khi thực hiện tìm kiếm
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                int target1 = library.getInt("Enter the number you want to search for using Binary Search:");

                int binarySearchResult = algorithm.binarySearch(array, target1, 0, size_array - 1);
                displaySearchResult("Binary Search", binarySearchResult);
                break;
            case 2:
                int target2 = library.getInt("Enter the number to search for:");
                int linearSearchResult = algorithm.linerSearch(array, target2);
                displaySearchResult("Linear Search", linearSearchResult);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void displaySearchResult(String searchType, int result) {
        if (result != -1) {
            System.out.printf("%s: Element found at index %d%n", searchType, result);
        } else {
            System.out.println(searchType + ": Element not found in the array");
        }
    }

}

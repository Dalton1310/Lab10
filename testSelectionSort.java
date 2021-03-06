package basicSelectionSort;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
public class testSelectionSort extends TestCase {
@Test

public void test() {
	testPositive();
	testNegative();
	testMixed();
	testDuplicates();
}
    public testSelectionSort() {
    }
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        SelectionSort positive = new SelectionSort();
        int[] arraySorted = positive.basicSelectionSort(arr);
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
        System.out.print("Expected positive array sorted: ");
        for (int element: Sortedarr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.print("Actual positive array sorted: ");
        for (int element: arraySorted) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        /** add tests to check for this unit test **/
    }

    public void testNegative(){
    	  int[] arr = new int[5];
          arr[0] = -6;
          arr[1] = -12;
          arr[2] = -20;
          arr[3] = -16;
          arr[4] = -1;
          SelectionSort negative = new SelectionSort();
          int[] arraySorted = negative.basicSelectionSort(arr);
          int[] Sortedarr = new int[5];
          Sortedarr[0] = -20;
          Sortedarr[1] = -16;
          Sortedarr[2] = -12;
          Sortedarr[3] = -6;
          Sortedarr[4] = -1;
          assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
          System.out.print("Expected negative array sorted: ");
          for (int element: Sortedarr) {
              System.out.print(element + " ");
          }
          System.out.println(" ");
          System.out.print("Actual negative array sorted: ");
          for (int element: arraySorted) {
              System.out.print(element + " ");
          }
          System.out.println(" ");
          /** add tests to check for this unit test **/
          }
    public void testMixed(){
    	  int[] arr = new int[5];
          arr[0] = 0;
          arr[1] = -12;
          arr[2] = -4;
          arr[3] = 20;
          arr[4] = 2;
          SelectionSort mixed = new SelectionSort();
          int[] arraySorted = mixed.basicSelectionSort(arr);
          int[] Sortedarr = new int[5];
          Sortedarr[0] = -12;
          Sortedarr[1] = -4;
          Sortedarr[2] = 0;
          Sortedarr[3] = 2;
          Sortedarr[4] = 20;
          assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
          System.out.print("Expected mixed array sorted: ");
          for (int element: Sortedarr) {
              System.out.print(element + " ");
          }
          System.out.println(" ");
          System.out.print("Actual mixed array sorted: ");
          for (int element: arraySorted) {
              System.out.print(element + " ");
          }
          System.out.println(" ");
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
    	  int[] arr = new int[5];
          arr[0] = 0;
          arr[1] = 12;
          arr[2] = 12;
          arr[3] = -5;
          arr[4] = -5;
          SelectionSort duplicate = new SelectionSort();
          int[] arraySorted = duplicate.basicSelectionSort(arr);
          int[] Sortedarr = new int[5];
          Sortedarr[0] = -5;
          Sortedarr[1] = -5;
          Sortedarr[2] = 0;
          Sortedarr[3] = 12;
          Sortedarr[4] = 12;
          assertEquals("Array is sorted", arraySorted[0], Sortedarr[0]);
          System.out.print("Expected duplicate array sorted: ");
          for (int element: Sortedarr) {
              System.out.print(element + " ");
          }
          System.out.println(" ");
          System.out.print("Actual duplicate array sorted: ");
          for (int element: arraySorted) {
              System.out.print(element + " ");
          }
          System.out.println(" ");

        /** Test data contains negative values only **/
        /** Test data contains duplicates **/
    }
}

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
        /** Test data contains duplicates **/
    }
}

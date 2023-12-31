package Searching;
import java.util.*;
/**
 * ceiling
 */
public class ceiling {
    public static int ceilingNumber(int array[], int key){
        int start = 0, end = array.length-1;
        if (key>array[end]) {
            return -1;
        }
        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int array[] = {2,3,5,9,14,16,18};
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();
        int ceiling = ceilingNumber(array, key);
        if (ceiling == -1) {
            System.out.println("Ceiling of a key is not found");
        } else {
            System.out.println("Ceiling of a key is " + array[ceiling]);
        }
    }
}
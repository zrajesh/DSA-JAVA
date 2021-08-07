import java.util.ArrayList;

// Merge the two sorted array [4, 6, 9] [3, 5, 7, 10] = [3, 4, 5, 6, 7, 9, 10]
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 6, 9};
        int[] nums2 = {3, 5, 7, 10};
        sortedArray(nums1, nums2);
    }

    public static int[] sortedArray(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        int[] sortedResult = new int[array1.length + array2.length];

        // Check Input
        if(array1.length == 0) {
            System.out.println("Array1 is Empty. So it is already sorted");
            return array2;
        }
        if(array2.length == 0) {
            System.out.println("Array2 is Empty. So it is already sorted");
            return array1;
        }

        while(i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) {
                sortedResult[k] = array1[i];
                i++;
                k++;
            } else {
                sortedResult[k] = array2[j];
                j++;
                k++;
            }
        }
        while (i < array1.length) {
            sortedResult[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            sortedResult[k] = array2[j];
            j++;
            k++;
        }
        while (m < (array1.length + array2.length)) {
            System.out.print(sortedResult[m] + " ");
            m++;
        }
        return sortedResult;
    }
}

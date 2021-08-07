// Given an array it should return 1st recurring number
// array = [2,5,1,2,3,5,2,1,4]
// It should return 2
// array2 [2,3,4,5] It should return undefined

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n^2)
//public class RecurringNumber {
//    public static void main(String[] args) {
//        int[] array = {2,5,1,2,3,5,2,1,4};
//        int i;
//        int j;
//        for (i=0; i<array.length-1; i++) {
//            for (j=1+i; j<array.length-1; j++) {
//                if(array[i] == array[j]) {
//                    System.out.println(array[i]);
//                    return;
//                }
//            }
//        }
//        System.out.println("No Recurring found");
//        return;
//    }
//}

// Time Complexity: O(n)
//public class RecurringNumberv2 {
//    public static void main(String[] args) {
//        int[] array = {2,5,1,2,3,5,2,1,4};
//        Map<Integer, Integer> recurNumbers = new HashMap<>();
//        for (int i=0; i<array.length; i++) {
//            if (recurNumbers.containsValue(array[i])) {
//                System.out.println(array[i]);
//                return;
//            } else {
//                recurNumbers.put(i, array[i]);
//            }
//        }
//        System.out.println("No match found!");
//        System.out.println(recurNumbers);
//        return;
//    }
//}

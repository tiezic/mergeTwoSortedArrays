import java.util.Arrays;

public class mergeMainHW2 { 
  
    public static void main(String[] args) {
        //test1 (i reaches max first)
        int[] array1 = {1, 3, 4, 6};
        int[] array2 = {2, 5, 7, 8};

        //test2 (j reaches max first)
        int[] ar3 = {2, 5, 7, 8};
        int[] ar4 = {1, 3, 4, 6};

        //test3 (larger arrays)
        int[] ar5 = {2, 5, 7, 8, 10, 11, 14};
        int[] ar6 = {1, 3, 4, 6, 9, 12, 13};

        //test4 (unequal sizes)
        int[] ar7 = {1, 2, 5, 6};
        int[] ar8 = {3, 4, 7};

        //test5 (negatives)
        int[] ar9 = {-6, -3, -2};
        int[] ar10 = {-5, -4, -1};

        //test6 (duplicate values)
        int[] ar11 = {1, 3, 3, 5};
        int[] ar12 = {1, 2, 4, 6};

        //test7 (gaps between #'s)
        int[] ar13 = {1, 5, 8, 12};
        int[] ar14 = {2, 6, 10, 15};

        System.out.println("Test 1: " + Arrays.toString(mergeArrays(array1, array2)));
        System.out.println("Test 2: " + Arrays.toString(mergeArrays(ar3, ar4)));
        System.out.println("Test 3: " + Arrays.toString(mergeArrays(ar5, ar6)));
        System.out.println("Test 4: " + Arrays.toString(mergeArrays(ar7, ar8)));
        System.out.println("Test 5: " + Arrays.toString(mergeArrays(ar9, ar10)));
        System.out.println("Test 5: " + Arrays.toString(mergeArrays(ar11, ar12)));
        System.out.println("Test 5: " + Arrays.toString(mergeArrays(ar13, ar14)));

    }

    static int[] mergeArrays(int[] array1, int[] array2) {      //create a method that takes in both sorted arrays
        int mergedArraySize = array1.length + array2.length;    
        int[] mergedArray = new int[mergedArraySize];           //create new array with size of array 1 + array 2
        int i = 0, j = 0, k = 0;                                //initialize counters
        
        while (i < array1.length && j < array2.length) {        //while j and i counters are not over the length of the array:

            if (array1[i] < array2[j]) {                        //if the current value of array 2 is bigger than array 1, then set  
                mergedArray[k] = array1[i];                       //the next index of mergedArray to array 1's value, increment array 1's
                i++;                                              //counter, i, then increment mergedArray's counter, k
            } else {                                            //else if array 1 value is bigger than array 2, set mergedArray index to
                mergedArray[k] = array2[j];                       //array 2, then increment array 2 counter as well as mergedArray counter
                j++;
            }

            k++;

        }

        while (i < array1.length) {                             //eventually, either i or j will go over their respective array lengths
            mergedArray[k] = array1[i];                         //and the rest of the array's values must be copied to mergedArray
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;

    } //end mergeArrays()
} //end mergeMain


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

    static int[] mergeArrays(int[] array1, int[] array2) {
        int mergedArraySize = array1.length + array2.length;
        int[] mergedArray = new int[mergedArraySize];
        int i = 0, j = 0, k = 0;
        
        while (i < array1.length && j < array2.length) {

            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }

            k++;

        }

        while (i < array1.length) {
            mergedArray[k] = array1[i];
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

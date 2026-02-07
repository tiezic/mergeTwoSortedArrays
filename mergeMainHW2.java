import java.util.Arrays;

public class mergeMainHW2 { 
  
    public static void main(String[] args) {
        mergeMainHW2 obj1 = new mergeMainHW2();
        int[] array1 = {1, 3, 4, 6};
        int[] array2 = {2, 5, 7, 8};

        System.out.println("Test: " + Arrays.toString(obj1.mergeArrays(array1, array2)));

    }

    int[] mergeArrays(int[] array1, int[] array2) {                //create a method that takes in both sorted arrays
        int mergedArraySize = array1.length + array2.length;
        int[] mergedArray = new int[mergedArraySize];              //create new array with size of array 1 + array 2
        int i = 0, j = 0, k = 0;                                   //initialize counters
        
        while (i < array1.length && j < array2.length) {           //while j and i counters are not over the length of the array:

            if (array1[i] < array2[j]) {                           //if the current value of array 2 is bigger than array 1, then set  
                mergedArray[k] = array1[i];                        //the next index of mergedArray to array 1's value, increment array 1's
                i++;                                               //counter, i, then increment mergedArray's counter, k
            } else {                                               //else if array 1 value is bigger than array 2, set mergedArray index to
                mergedArray[k] = array2[j];                        //array 2, then increment array 2 counter as well as mergedArray counter
                j++;
            }
            k++;

        }

        while (i < array1.length) {                                //eventually, either i or j will go over their respective array lengths

            mergedArray[k] = array1[i];                            //and the rest of the array's values must be copied to mergedArray
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


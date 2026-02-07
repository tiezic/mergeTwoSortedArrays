import java.util.Arrays;

public class mergeMainHW2 { 
  
    public static void main(String[] args) {
        mergeMainHW2 obj1 = new mergeMainHW2();
        int[] array1 = {1, 3, 4, 6};
        int[] array2 = {2, 5, 7, 8};

        System.out.println("Test: " + Arrays.toString(obj1.mergeArrays(array1, array2)));

    }

    int[] mergeArrays(int[] array1, int[] array2) {
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

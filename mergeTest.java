import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class mergeTest {
    
    @ParameterizedTest
    @MethodSource("arrayList")
    public void testCopy(int[] arr1, int[] arr2, int[] expectArr) {
        mergeMainHW2 obj = new mergeMainHW2();
        assertArrayEquals(expectArr, obj.mergeArrays(arr1, arr2));

    }

    static Stream<Arguments> arrayList() {
        return Stream.of(
            Arguments.of(
                //test1 (i reaches max first)
                new int[]{1, 3, 4, 6},              //array 1
                new int[]{2, 5, 7, 8},              //array 2
                new int[]{1, 2, 3, 4, 5, 6, 7, 8}   //expected array
            ),
            Arguments.of(
                //test2 (j reaches max first)
                new int[]{2, 5, 7, 8},              //array 1
                new int[]{1, 3, 4, 6},              //array 2
                new int[]{1, 2, 3, 4, 5, 6, 7, 8}   //expected array
            ),
            Arguments.of(
                //test3 (unequal sizes)
                new int[]{1, 3, 4, 6, 8, 10},              //array 1
                new int[]{2, 5, 7, 9},                     //array 2
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}   //expected array
            ),
            Arguments.of(
                //test4 (negative values)
                new int[]{-5, -3, -2},               //array 1
                new int[]{-6, -4, -1},               //array 2
                new int[]{-6, -5, -4, -3, -2, -1}    //expected array
            ),
            Arguments.of(
                //test5 (duplicate values)
                new int[]{1, 1, 2, 5},               //array 1
                new int[]{2, 3, 4, 6},               //array 2
                new int[]{1, 1, 2, 2, 3, 4, 5, 6}    //expected array
            ),
            Arguments.of(
                //test6 (gaps between values)
                new int[]{1, 3, 5, 7},               //array 1
                new int[]{2, 6, 9, 12},              //array 2
                new int[]{1, 2, 3, 5, 6, 7, 9, 12}   //expected array
            ),
            Arguments.of(
                //test7 (empty array 2)
                new int[]{1, 2, 3},                  //array 1
                new int[]{},                         //array 2
                new int[]{1, 2, 3}                   //expected array
            ),
            Arguments.of(
                //test8 (null case)
                new int[]{},                         //array 1
                new int[]{},                         //array 2
                new int[]{}                          //expected array
            )
        );
    }

}

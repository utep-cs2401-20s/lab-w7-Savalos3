import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortOfSortTester { //Ten total test cases
    @Test
    public void SortofSort1(){ //first to make sure that my first 4 loop works
        SortOfSort test = new SortOfSort();

        int [] example = {3,4};
        int [] ex = {3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort2(){ //this test case checks to see if code works under negative numbers.
        SortOfSort test = new SortOfSort();

        int [] example = {-4,2,1,5,-6};
        int [] ex = {1,-4,-6,2,5};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort3(){ //test case makes sure that my code does not traverse the same positions of array.
        SortOfSort test = new SortOfSort();

        int [] example = {3,4,2};
        int [] ex = {2,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort4(){ //test case makes sure code runs with 4 digit arrays .
                                //I had to change the conditionals in order to work correctly with exactly length 4.
        SortOfSort test = new SortOfSort();

        int [] example = {3,4,2,1};
        int [] ex = {2,1,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
        }
    @Test
    public void SortofSort5(){ // This test case checks to see if under a certain order(L to G) if the code still runs correctly
        SortOfSort test = new SortOfSort();

        int [] example = {4,3,2,1};
        int [] ex = {2,1,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }

    @Test
    public void SortofSort6(){ // checked to see what would happen if code was already fixed.
        SortOfSort test = new SortOfSort();

        int [] example = {3,2,1,4,5};
        int [] ex = {3,2,1,4,5};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }

    @Test
    public void SortofSort7(){ //this test case is used to see if under larger arrays if the code still ran.
        SortOfSort test = new SortOfSort();

        int [] example = {7,4,5,1,6,3,2};
        int [] ex = {5,4,1,2,3,6,7};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort8(){
        SortOfSort test = new SortOfSort();

        int [] example = {7,4,5,9,6,3,2,8,1};
        int [] ex = {7,6,3,2,1,4,5,8,9};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort9(){
        SortOfSort test = new SortOfSort();

        int [] example = {10,9,8,7,6,5,4,3,2,1};
        int [] ex = {8,7,4,3,1,2,5,6,9,10};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
}

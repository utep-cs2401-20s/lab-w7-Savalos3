import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    @Test
    public void SortofSort1(){
        SortOfSort test = new SortOfSort();

        int [] example = {3,4};
        int [] ex = {3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort2(){
        SortOfSort test = new SortOfSort();

        int [] example = {-4,2,1,5,-6};
        int [] ex = {1,-4,-6,2,5};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort3(){
        SortOfSort test = new SortOfSort();

        int [] example = {3,4,2};
        int [] ex = {2,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }
    @Test
    public void SortofSort4(){
        SortOfSort test = new SortOfSort();

        int [] example = {3,4,2,1};
        int [] ex = {2,1,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
        }
    @Test
    public void SortofSort5(){
        SortOfSort test = new SortOfSort();

        int [] example = {4,3,2,1};
        int [] ex = {2,1,3,4};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }

    @Test
    public void SortofSort6(){
        SortOfSort test = new SortOfSort();

        int [] example = {3,4,5,1,2};
        int [] ex = {3,2,1,4,5};
        int [] result = test.sortOfSort(example);

        assertArrayEquals(ex , example);
    }

    @Test
    public void SortofSort7(){
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

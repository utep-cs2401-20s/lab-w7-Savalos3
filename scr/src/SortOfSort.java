public class SortOfSort {

    public static int[] sortOfSort(int [] set){
        int n = set.length; //Used to determine length of array.
        int left = 0; //controls where to start search when going through array.
        int right = set.length-1; //controls where to end search when going through array

        for(int i = set.length-1; i >= 0; i--){

            int max = right; //right bound of array.
            if(i%n == n-1  || i % n == n-2 )  { // only runs this conditional on the first 2 positions before length of array.
                for (int j = right - 1; j >= left; j--) {
                    if (set[j] > set[max]) {
                        max = j;
                    }
                }
                int temp = set[max];
                set[max] = set[right];
                set[right] = temp;
                right--;

            }else{ //runs on the 3rd and 4th position before length of array.
                max = left; //left bound of array.
                  for (int j = left + 1; j < right+1; j++) {
                      if (set[j] > set[max]) {
                          max = j;
                      }
                  }
            if(i % n == n-4 ){ //This in a way changes the way the loops see the length of the array.
                n = n - 4; // n is used to make sure the conditionals are met no matter the length of the initial array.
            }
                int temp = set[max];
                set[max] = set[left];
                set[left] = temp;
                left++;

            }

            }
        return set;

    }
}

import java.util.*;
import java.util.Arrays;

 
class MissingNumber
{
    // Find the missing number in a given array
    public static int getMissingNumber(int[] arr)
    {
        // get the array's length
        int n = arr.length;
 
        // the actual size is `n+1` since a number is missing from the array
        int m = n + 1;
 
        // get a sum of integers between 1 and `n+1`
        int total = m * (m + 1) / 2;
 
        // get an actual sum of integers in the array
        int sum = Arrays.stream(arr).sum();
 
        // the missing number is the difference between the expected sum
        // and the actual sum
        return total - sum;
    }
 
   public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
 
        System.out.println("The missing number is " + getMissingNumber(arr));
    }
}
package L3_TimeComplexity.PermMissingElem;
/**
 * Created by sumedas on 25-Mar-16.
 *
 * PermMissingElem
 * Find the missing element in a given permutation.
 */

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
		// type cast numerator to long (by changing 2 to 2L), to avoid integer overflow
        long totalSum = (A.length + 1L) * (A.length + 2L) / 2L;
        
        long arraySum = 0L;
        
        for (final int num : A)
        {
            arraySum += num;
        }
        
		return (int) (totalSum - arraySum);
    }
}
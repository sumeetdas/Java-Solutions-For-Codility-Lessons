package L2_Arrays.OddOccurrencesInArray;
/**
 * Created by sumedas on 25-Mar-16.
 *
 * Find value that occurs in odd number of elements.
 */

public class Solution {

	public int solution(int[] A) {
        // write your code in Java SE 8
		
		int result = A[0];
		
		for (int i = 1; i < A.length; i++)
		{
			// http://codereview.stackexchange.com/a/3062
			// since an element can be expected to appear in a factor of two, we can XOR them to nullify pairs
			// only the unique element remains
			result ^= A[i];
		}
		
		return result;
    }
    
}

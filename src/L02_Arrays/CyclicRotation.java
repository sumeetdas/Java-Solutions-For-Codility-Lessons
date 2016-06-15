package L2_Arrays.CyclicRotation;
/**
 * Created by sumedas on 25-Mar-16.
 * 
 * Rotate an array to the right by a given number of steps.
 */

public class Solution {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int[] result = new int[A.length];
		
		for (int i = 0; i < A.length; i++)
		{
			result[ (i + K) % A.length] = A[i];
		}
		
		return result;
    }
}

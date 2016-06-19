package L3_TimeComplexity.TapeEquilibrium;
/**
 * Created by sumedas on 25-Mar-16.
 * 
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
		final long[] indexSumArray = new long[A.length];
		
		indexSumArray[0] = A[0];
		
		for (int i = 1; i < A.length; i++)
		{
			indexSumArray[i] = A[i] + indexSumArray[i - 1];
		}	

		int minDifference = Integer.MAX_VALUE;
		
		for (int i = 0; i < A.length - 1; i++)
		{
			// array sum other than first element = Array sum - first element
			// required difference = Math.abs (array sum other than first element - first element)
			int difference = (int) Math.abs(indexSumArray[A.length - 1] - 2 * indexSumArray[i]);
			
			if ( minDifference > difference )
			{
				minDifference = difference;
			}			
		}
		
		return minDifference;
    }
}

package L4_CountingElements.FrogRiverOne;
/**
 * Created by sumedas on 25-Mar-16.
 *
 * Find the earliest time when a frog can jump to the other side of a river.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public int solution(int X, int[] A) {
        // write your code in Java SE 8
		
		// 1 to 1L
		long stepSum = X * (X + 1L) / 2L;
		
		final boolean[] leafExistAt = new boolean[X + 1];
		
		for (int i = 0; i < A.length; i++)
		{
			if (!leafExistAt[A[i]])
			{
				stepSum -= A[i];
				leafExistAt[A[i]] = true;
			}
			
			if (stepSum == 0)
			{
				return i;
			}
		}
		
		// clearly, at this point, stepSum is not zero, hence its not possible for
		// the frog to cross the river
		return -1;
    }
}
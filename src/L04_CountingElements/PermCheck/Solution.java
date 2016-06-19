package L4_CountingElements.PermCheck;
/**
 * Created by sumedas on 25-Mar-16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
		
		int i = 0;
		
		while (i < A.length)
		{
			if (A[i] == i + 1)
			{
				i++;
				continue;
			}
			else if (A[i] >= A.length + 1 || A[i] <= 0)
			{
				// elements must not be greater than N and less than 1
				return 0;
			}
			else if (A[A[i] - 1] == A[i])
			{
				// lets say i = 1, A[1] = 4, and A[A[i] - 1] = A[4 - 1] = A[3] = A[i] = 4
				// then A[1] = 4 and A[3] = 4 have the same values, hence the array is not a sequence
				// since the values should not repeat
				return 0;
			}
			else
			{
				// swap the elements
				int temp = A[i];
				A[i] = A[A[i] - 1];
				A[A[i] - 1] = temp;
			}
		}
		
		return 1;
    }
}

package L1_Iterations.BinaryGap;
/**
 * Created by sumedas on 25-Mar-16.
 * 
 * Find longest sequence of zeros in binary representation of an integer.
 */

public class Solution {

    public int solution(int N) {
        // write your code in Java SE 8
		int maxLength = 0;
		
		// get rid of trailing zeroes
		while ( (N & 1) == 0)
		{
			N >>= 1;
			continue;
		}
		
		int currentLength = 0;
			
		while (N != 0)
		{
			if ( (N & 1) == 1)
			{
				if (maxLength < currentLength)
				{
					maxLength = currentLength;
				}
				currentLength = 0;
			}
			else
			{
				currentLength++;
			}
			
			N >>= 1;
		}
		
		return maxLength;
    }
}

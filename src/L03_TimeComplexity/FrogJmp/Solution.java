package L3_TimeComplexity.FrogJmp;
/**
 * Created by sumedas on 25-Mar-16.
 *
 * Count minimal number of jumps from position X to Y.
 */
 
 import java.math.*;

public class Solution {

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		// Complexity: O(1)
		return (int) Math.ceil ( ( (double) (Y - X) ) / D );
    }
}

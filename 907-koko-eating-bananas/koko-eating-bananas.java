public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);
        
        // Binary search to find the minimum valid eating speed
        while (left < right) {
            int k = left + (right - left) / 2;
            if (canFinish(piles, k, h)) {
                right = k;
            } else {
                left = k + 1;
            }
        }
        
        return left;
    }

    // Helper function to get the maximum value in the piles array
    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
    
    // Helper function to determine if Koko can finish eating all the bananas at speed k within h hours
    private boolean canFinish(int[] piles, int k, int h) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + k - 1) / k;  // Equivalent to ceil(pile / k)
        }
        return time <= h;
    }

  
}

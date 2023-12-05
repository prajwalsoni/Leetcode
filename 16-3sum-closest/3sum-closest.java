public class Solution {

    public static int threeSumClosest(int[] nums, int target) {
        // Sort the array to simplify the solution
        Arrays.sort(nums);

        // Initialize variables for the closest sum and the minimum difference
        int closestSum = 0;
        int minDifference = Integer.MAX_VALUE;

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int difference = Math.abs(sum - target);

                // Update closestSum if the current sum is closer to the target
                if (difference < minDifference) {
                    minDifference = difference;
                    closestSum = sum;
                }

                // Adjust pointers based on the comparison with the target
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}

    
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findStartPos(nums, target);
        res[1] = findEndPos(nums, target);
        return res;
    }

    private int findStartPos(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int midPos = left + (right - left) / 2;

            if (target == nums[midPos]) {
                ans = midPos;
                right = midPos - 1;
            } else if (target > nums[midPos]) {
                left = midPos + 1;
            } else {
                right = midPos - 1;
            }
        }
        return ans;
    }

    private int findEndPos(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int midPos = left + (right - left) / 2;

            if (target == nums[midPos]) {
                ans = midPos;
                left = midPos + 1;
            } else if (target > nums[midPos]) {
                left = midPos + 1;
            } else {
                right = midPos - 1;
            }
        }
        return ans;
    }
}
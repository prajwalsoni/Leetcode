class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            int midpointElement = matrix[midpoint / columns][midpoint % columns];

            if (midpointElement == target) {
                return true;
            } else if (midpointElement < target) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }

        return false;
    }

   
}


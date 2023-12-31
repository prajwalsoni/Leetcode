class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxDistance = -1;

        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    maxDistance = Math.max(maxDistance, right - left - 1);
                }
            }
        }

        return maxDistance;
    }
}
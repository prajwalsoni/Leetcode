class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int turns = 0, n = happiness.length;
        long happinessSum = 0;
        Integer[] happinessArray = new Integer[n];
        for(int i = 0; i < n; i++) {
            happinessArray[i] = happiness[i];
        }
        Arrays.sort(happinessArray, Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            happinessSum += Math.max(happinessArray[i] - turns, 0);
            turns++;
        }

        return happinessSum;
    }
}
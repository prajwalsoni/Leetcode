class Solution {
    public List<List<Integer>> threeSum(int[] num) {

        Set<List<Integer>> result = new HashSet<>();
        if(num.length<=0) return new ArrayList<>();

        Arrays.sort(num);
        for(int i=0; i<num.length-2; i++) {
            int j=i+1;
            int k=num.length-1;
            while(k>j) {
                int sum = num[j] + num[k] + num[i];
                if(sum == 0)
                    result.add(Arrays.asList(num[i], num[j++], num[k--]));
                else if (sum > 0)
                    k--;
                else
                    j++;
            }
        }
        return new ArrayList(result);
    }
}
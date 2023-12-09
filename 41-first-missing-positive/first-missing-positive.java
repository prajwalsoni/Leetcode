class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length, curr = 0;
        while(curr<len){
            int exp = curr +1; //Change zero indexing to one indexing
            if(nums[curr]==exp||nums[curr]<1||nums[curr]>len)//These numbers do not have a place in the array - Move forward
                curr +=1;
            else{
                int before = nums[curr];
                swap(nums,curr);
                int after = nums[curr];
                if(before==after) //Swap was not useful - Move forward
                    curr+=1;
            } 
        }
        int i;
        for(i = 0; i<len; i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return i+1; //If the array is perfect just return the next number
    }

 //swaps a number x in a position y with number z in position x. We assume x always lie in the array because swap is only called when we know it's valid to swap
    private void swap(int[] nums, int pos){
        int val = nums[nums[pos]-1];
        nums[nums[pos] - 1] = nums[pos];
        nums[pos] = val;
        return;
    }
}
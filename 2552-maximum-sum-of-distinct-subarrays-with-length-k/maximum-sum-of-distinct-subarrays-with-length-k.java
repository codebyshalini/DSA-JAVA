class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();//no duplicate element take
        long currSum = 0;
        long maxSum = 0;
        int start = 0;
        for(int end =0; end<nums.length;end++){
            // contain duplicated elemnet and size==k
            while(set.contains(nums[end])|| set.size()==k)
            {
                set.remove(nums[start]);
                currSum -=nums[start];
                start++;

            }
            currSum+=nums[end];
            set.add(nums[end]);
            if(set.size()==k){
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
        
    }
}
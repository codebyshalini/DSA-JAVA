class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =   new ArrayList<>();
        // sort array
        Arrays.sort(nums);
        // for make tripple travser array form nums.length-2;
        for(int i =0; i<nums.length-2;i++){
            // skip diplicate value
            if(i >0&&nums[i]==nums[i-1]) continue;
            // real code start . and fixed one element form left
            int left = i+1;
            int right = nums.length-1;
        while(left<right){
          int sum = nums[i] + nums[left] + nums[right];
            if(sum==0) {
                
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));

            // skip duplicatw from left
            while(left<right&&nums[left]==nums[left+1])left++;
            // skip duplicatw from right
            while(left<right&& nums[right]==nums[right-1]) right--;


            left++;
            right --;
            }
            else if(sum<0) {// need bigger some
            left++;
                
            }
            else{
                right--;
            }

            




            
        }

       



        }
        return result;
        
    }
}
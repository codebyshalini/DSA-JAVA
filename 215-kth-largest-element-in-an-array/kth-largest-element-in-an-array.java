class Solution {
    public int findKthLargest(int[] nums, int k) {
        // create mon heap
        PriorityQueue<Integer> pq = new  PriorityQueue<>();
        // add eleemnts
        for( int num:nums){
            pq.add(num);
        
        // remove element until k
        if(pq.size()>k){
            pq.poll();
        }
        
        
    }
    return pq.peek();
    }


}
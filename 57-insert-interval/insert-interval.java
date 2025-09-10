class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        // stor before overlapping
        int i =0;
        int n = intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        //merge overlapping if any
        while(i<n&& newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        // appand remaining intervals
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);

        


        
    }
}
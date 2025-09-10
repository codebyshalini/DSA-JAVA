class Solution {
    public int[][] merge(int[][] intervals) {
        // sort intervals by taking 1st element
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        // ist intervals
        int start = intervals[0][0];
        int end = intervals[0][1];
        // make aaraylist
        List<int[]> list = new ArrayList<>();
        // iterate
        for(int i=1;i<intervals.length;i++){
            // 2nd interval
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s<=end){
                end = Math.max(end,e);
            }
            else{
                // add
                list.add(new int[]{start,end});
                start = s;
                end = e;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}
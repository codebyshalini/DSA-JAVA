class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int sqr =n*n;
        int set [] = new int[sqr+1];
        int ans [] = new int[2];// put missing and repeating no
        int currSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set[grid[i][j]]!=0){
                    //repeating no
                    ans[0]=grid[i][j];
            }
            else{
                set[grid[i][j]]=1;
                currSum += grid [i][j];
            }
        }
        }
        // mssing no
        int totalSum = sqr*(sqr+1)/2;
        ans[1]=totalSum -currSum;
        return ans;
        
    }
}
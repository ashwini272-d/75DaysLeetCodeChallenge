class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int dupli=-1;
        int miss=-1;
        for(int i=1;i<=n*n;i++){
            int freq=map.getOrDefault(i,0);
            if(freq==2){
                dupli=i;
            }
            if(freq==0){
                miss=i;
            }
        }
        return new int[]{dupli,miss};
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }
    public List<Integer> generateRow(int row){
        List<Integer> temp=new ArrayList<>();
        long ans=1;
        temp.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/(col);
            temp.add((int)ans);
        }
        return temp;
    }
}
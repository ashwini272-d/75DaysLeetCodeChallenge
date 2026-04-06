class Solution {
    public int findMin(int[] arr) {
        PriorityQueue<Integer> min = new PriorityQueue<>() ;
        for( int i : arr ){
            min.add(i) ; 
        }
        return min.poll() ; 
    }
}
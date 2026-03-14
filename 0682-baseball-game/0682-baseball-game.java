class Solution {
    public int calPoints(String[] arr) {
        int res=0;
        ArrayList<Integer> rec=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("C")){
                rec.remove(rec.size()-1);
            }
            else if(arr[i].equals("D")){
                rec.add(2 * rec.get(rec.size()-1));
            }
            else if(arr[i].equals("+")){
                rec.add(rec.get(rec.size()-1)+rec.get(rec.size()-2));
            }
            else {
                rec.add(Integer.parseInt(arr[i]));
            }
        }
        for(int i=0;i<rec.size();i++){
            res+=rec.get(i);
        }
        return res;
    }
}
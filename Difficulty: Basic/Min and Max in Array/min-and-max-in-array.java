class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
}

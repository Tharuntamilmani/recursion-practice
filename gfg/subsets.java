class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new  ArrayList<>();
        ArrayList<Integer> set1=new ArrayList<>();
        subset(arr,arr.length,set1,ans);
        return ans;
    }
    static void subset(int[] arr,int n, ArrayList<Integer> set1, ArrayList<ArrayList<Integer>> ans){
        if(n==0){
            ans.add(new ArrayList<>(set1));
            return;
        }
        set1.add(arr[n-1]);
        subset(arr,n-1,set1,ans);
        set1.remove(set1.size()-1);
        subset(arr,n-1,set1,ans);
    }
}

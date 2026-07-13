class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int ans[]=new int[n];
        ans[0]=arr[0];
        ans[1]=Math.max(arr[0],arr[1]);

        for(int i=2;i<n;i++){
            int case1=arr[i]+ans[i-2];
            int case2=ans[i-1];
            ans[i]=Math.max(case1,case2);
        }
        return ans[n-1];
    }
}
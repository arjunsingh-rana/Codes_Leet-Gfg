class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=nums1.length;
        int n=nums2.length;
        int nge[]=new int[m];
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && nums2[i]>=st.peek()) st.pop();
           if(st.isEmpty()) map.put(nums2[i],-1);
           else map.put(nums2[i],st.peek()); 
           st.push(nums2[i]);
        }
        for (int i = 0; i < m; i++) {
            nge[i] = map.get(nums1[i]);
        }
        return nge;
    }
}
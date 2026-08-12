class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n-k];
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);

            while(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
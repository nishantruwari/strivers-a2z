class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(nums.length==0) return 0;
        for(int i:nums){
            pq.offer(i);
        }

        int count=0;
        int max=1;
        int curr=pq.poll();
        count=1;
        while(!pq.isEmpty()){
            if(pq.peek()==curr){
                pq.poll();
                continue;
            }
            if(pq.peek()==curr+1){
                ++count;
                max=max<count?count:max;
                curr=pq.poll();
            }else {
                curr=pq.poll();
                count=1;
            }
        }

        return max;
        
    }
}

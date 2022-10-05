class Solution {
    public int jump(int[] nums) {
        int jumps =0, curEnd =0, possibleMax =0;
        for(int i=0; i<nums.length-1;i++)
        {
            possibleMax =Math.max(possibleMax,i+nums[i]);
                if(i==curEnd)
                {
                    jumps++;
                    curEnd=possibleMax;     
                }
        }
        return jumps;
            
            
    }
}

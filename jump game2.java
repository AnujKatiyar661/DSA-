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

// Adding Code of Jump Game IInd Using Greedy Approach
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            max = Math.max(max , i + nums[i]);
            
            if(curr == i){
                curr = max;
                count++;
            }
            if(curr>nums.length-1){
                return count;
            }
        }
        return count;
    }
}

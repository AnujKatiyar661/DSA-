class Solution {
    public int countDistinctIntegers(int[] nums) {
        int ct=0;
        ArrayList<Integer>ls=new ArrayList<>();
        Set<Integer>hs=new HashSet<>();
        for(int i:nums)
            ls.add(i);
        for(int i:nums){
            int n=i;
            int s=0;
            while(n>0){
                int y=n%10;
                s=s*10+y;
                n=n/10;
            }
            ls.add(s);
        }
        
            hs.addAll(ls);
        
            return hs.size();
    }
}

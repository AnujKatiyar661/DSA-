class Solution {
    public List<Integer> Helper(TreeNode root,List<Integer>list) {
        if(root == null) return list;
        
        
        //add order
        list.add(root.val);
        
        Helper(root.left,list);
        Helper(root.right,list);
        // change the code
        return list;
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list=new ArrayList<>();
        return Helper(root,list);
    }
}

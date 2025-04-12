/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q =new LinkedList<>();
        if(root==null) return ans;

        q.offer(root);

        traverse(ans,q);
        return ans;
    }
    public void traverse(List<List<Integer>> ans,Queue<TreeNode> q){
        while(!q.isEmpty()){
            
            List<Integer> curr=new ArrayList<>();

            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                curr.add(temp.val);
            }
            ans.add(curr);
        }

        return ;
    }
}

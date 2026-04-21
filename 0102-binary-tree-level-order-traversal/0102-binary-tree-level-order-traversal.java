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
        if(root==null)return new ArrayList<>();

        List<List<Integer>> res=new ArrayList<>();
        java.util.ArrayDeque<TreeNode> q=new java.util.ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> lvl=new ArrayList<>(s);

            while(s-->0){
                TreeNode n=q.poll();
                lvl.add(n.val);
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
            }

            res.add(lvl);
        }
        return res;
    }
}
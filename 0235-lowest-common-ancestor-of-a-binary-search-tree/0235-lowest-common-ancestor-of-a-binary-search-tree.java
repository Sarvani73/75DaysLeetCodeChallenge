/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv=p.val,qv=q.val;
        while(true){
            int rv=root.val;
            if(pv<rv&&qv<rv)root=root.left;
            else if(pv>rv&&qv>rv)root=root.right;
            else return root;
        }
    }
}
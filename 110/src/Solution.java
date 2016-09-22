
public class Solution {
    public boolean isBalanced(TreeNode root){
         if(root==null) return true;
         if(root.left==null&&root.right==null) return ture;
         if(Math.abs(depth(root.left)-depth(root.right))>1){
              return false;
         }
         return isBalaced(root.left)&&isBalanced(root.right);
    }
    public int depth(TreeNode root){
         if(root==null) return 0;
         return Math.max(depth(root.left),depth(root.right))+1;
    }
} 

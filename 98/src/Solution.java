
public class Solution {
   public boolean isValidBST(TreeNode root){
	   return BST(root,Long.MAX_VALUE,Long.MIN_VALUE);
   }
   public boolean BST(TreeNode root,long maxValue,long minValue){
	   if(root==null) return true;
	   if(root.val>=maxValue||root.val<=minValue) return false;
	   return BST(root.left,root.val,minValue)&&BST(root.right,maxValue,root.val);
   }
}

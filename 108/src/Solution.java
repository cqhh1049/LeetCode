
public class Solution {
	 public boolean isBalanced(TreeNode root) {
		 if(root==null) return true;
		 if(root.left==null&&root.right==null){
			 return true;
		 }
		 if(Math.abs(depth(root.left)-depth(root.right))>1){
			 return false;
		 }
		 return isBalanced(root.left)&&isBalanced(root.right);
	 }
	 private int depth(TreeNode root){
		 if(root==null) return 0;
		 return Math.max(depth(root.left), depth(root.right))+1;
	 }
} 

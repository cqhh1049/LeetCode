public class Solution {
	public int countNodes(TreeNode root){
		if(root==null) return 0;
		int leftDepth=getLeftDepth(root);
		int rightDepth=getRightDepth(root);
		if(leftDepth==rightDepth) return ((1<<leftDepth)-1);
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	
	public int getLeftDepth(TreeNode node){
		int count=0;
		while(node!=null){
			count++;
			node=node.left;
			
		}
		return count;
	}
	
	public int getRightDepth(TreeNode node){
		int count=0;
		while(node!=null){
			count++;
			node=node.right;
			
		}
		return count;
	}
}



public class Solution {
     public TreeNode sortedArrayToBST(int[] nums){
    	 return sorted(nums,0,nums.length-1);
     }
     private TreeNode sorted(int[] nums,int left,int right){
    	 if(left<right) return null;
    	 int mid=(left+right)/2;
    	 TreeNode leftNode=sorted(nums,left,mid-1);
    	 TreeNode rightNode=sorted(nums,mid+1,right);
    	 TreeNode node=new TreeNode(nums[mid]);
    	 node.left=leftNode;
    	 node.right=rightNode;
    	 return node;
     }
} 

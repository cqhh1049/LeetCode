
public class Solution {
   public boolean pathSum(TreeNode root,int sum){
	   return getSum(root,0,sum);
   }
          boolean getSum(TreeNode node,int curSum,int sum){
        	  if(node==null) return false;
        	  if(node.left==null&&node.right==null){
        		  return node.val+curSum==sum;
        	  }
        	  return getSum(node.left,curSum+node.val,sum)||getSum(node.right,curSum+node.val,sum);
          }
} 

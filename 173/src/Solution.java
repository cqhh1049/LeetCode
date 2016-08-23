import java.util.Stack;

public class Solution {
       Stack<TreeNode> stack;
       public void BSTIterator(TreeNode root){
    	   stack=new Stack<TreeNode>();
    	   while(root!=null){
    		   stack.push(root);
    		   root=root.left;
    	   }
       }
       boolean hasNext(){
    	   return !stack.isEmpty();
       }
       
       int next(){
    	   TreeNode node=stack.pop();
    	   int res=node.val;
    	   if(node.right!=null){
    		   node=node.right;
    		   while(node!=null){
    			   stack.push(node);
    			   node=node.left;
    		   }
    	   }
    	   return res;
       }
    	
} 

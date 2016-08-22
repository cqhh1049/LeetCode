 import java.util.ArrayList;
 import java.util.List;
 import java.util.Stack;
public class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
    	
    	if (root==null) return res;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root);
    	
    	while(!stack.isEmpty()) {
	    		
    		TreeNode top = stack.pop();
    		res.add(top.val);
    		
    		if (top.right != null) {
    			stack.push(top.right);
    		}	
    		if (top.left != null) { 
    			stack.push(top.left);
    		}
    	}
	    	
    	return res;
	}
}

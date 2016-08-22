 import java.util.ArrayList;
 import java.util.List;
 import java.util.Stack;

public class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
	 List<Integer> res = new ArrayList<Integer>();
 	if (root==null) return res;
 	Stack<TreeNode> stack = new Stack<TreeNode>();
 	stack.push(root);
 	while(!stack.isEmpty()){
 	TreeNode top=stack.peek();
 	if(top.left==null&&top.right==null){
 		stack.pop();
 		res.add(top.val);
 	}else{
 		if(top.right!=null){
 			stack.push(top.right);
 			top.right=null;
 		}
 		if(top.left!=null){
 			stack.push(top.left);
 			top.left=null;
 		}
 	}
 	}
 	return res;
	}
}

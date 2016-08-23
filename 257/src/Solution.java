import java.util.Stack;

public class Solution {
	public int KthSmallest(TreeNode root,int k){
		if(root==null) return 0;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode p=root;
		int result=0;
		while(!stack.isEmpty()||p!=null){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}else{
				TreeNode temp=stack.pop();
				k--;
				if(k==0){
					return result=temp.val;
				}
				p=temp.right;
			}
		}
		return result;
	}
}


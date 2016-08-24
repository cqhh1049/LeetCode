import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
   public List<Integer> rightSideView(TreeNode root){
	   List<Integer> res=new ArrayList<Integer>();
	   if(root==null) return res;
	   LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
	   queue.add(root);
	   while(!queue.isEmpty()){
		   int size=queue.size();
		   for(int i=0;i<size;i++){
			   TreeNode node=queue.poll();
			   if(i==0) res.add(node.val);
			   if(node.right!=null){
				   queue.add(root.right);
			   }
			   if(node.left!=null){
				   queue.add(root.left);
			   }
		   }
	   }
	   return res;
   }
}


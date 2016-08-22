import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		if(root==null) return list;
		Queue<TreeNode> currentLevel=new LinkedList<TreeNode>();
		currentLevel.add(root);
		while(!currentLevel.isEmpty()){
			List<Integer> currentList=new ArrayList<Integer>();
			int size=currentLevel.size();
			for(int i=0;i<size;i++){
				TreeNode currentNode=currentLevel.poll();
				currentList.add(currentNode.val);
				if(currentNode.left!=null){
					currentLevel.add(currentNode);
				}
				if(currentNode.right!=null){
					currentLevel.add(currentNode);
				}
			}
			list.add(currentList);
		}
		return list;
	}
} 

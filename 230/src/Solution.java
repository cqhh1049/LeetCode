import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	  public List<String> binaryTreePath(TreeNode root){
		  List<String> res=new ArrayList<>();
		  if(root==null) return res;
		  StringBuilder sb=new StringBuilder();
		  rec(root,sb,res);
		  return res;
	  }
	  void rec(TreeNode root,StringBuilder sb,List<String> res){
          if(root.left==null&&root.right==null){
        	  sb.append(root.val);
        	  res.add(sb.toString());
        	  return ;
          }
          sb.append(root.val);
          sb.append("->");
          int len=sb.length();
          if(root.left!=null) rec(root.left,sb,res);
          sb.setLength(len);
          if(root.right!=null) rec(root.right,sb,res);
	  }
}


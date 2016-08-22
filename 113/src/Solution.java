import java.util.List;
import java.util.*;
import java.util.ArrayList;
public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum){
	   List<List<Integer>> path=new ArrayList<List<Integer>>();
	   List<Integer> sumList=new ArrayList<Integer>();
	   getSum(root,sum,sumList,path);
	   return path;
   }
	private void getSum(TreeNode root,int sum,List<Integer> sumList,List<List<Integer>> path){
		if(root==null) return ;
		sumList.add(root.val);
		sum-=root.val;
		if(root.left==null&&root.right==null){
			if(sum==0){
				path.add(new ArrayList<Integer>(sumList));
			}
		}else{
			if(root.left!=null){
				getSum(root.left,sum,sumList,path);
			}
			if(root.right!=null){
				getSum(root.right,sum,sumList,path);
			}
		}
		/**
		 * 需要把sumList恢复到递归调用之前的状态
		 * 基础数据类型(int,long)与对象类型(Object,数组,容器)的引用时,递归调用如果修改了,递归对象修改了容器对象的内容
		 * 当回溯时需要恢复"现场",对于基本数据类型,传入的是它的拷贝值,并没有修改它,而对ArrayList传入的是引用或者地址
		 * 传引用还是传拷贝是很细致的问题，但是在递归实现的时候这些细节必须处理好，不然容易引入bug。
		 */
		sumList.remove(sumList.size()-1);
	}
} 

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
		 * ��Ҫ��sumList�ָ����ݹ����֮ǰ��״̬
		 * ������������(int,long)���������(Object,����,����)������ʱ,�ݹ��������޸���,�ݹ�����޸����������������
		 * ������ʱ��Ҫ�ָ�"�ֳ�",���ڻ�����������,����������Ŀ���ֵ,��û���޸���,����ArrayList����������û��ߵ�ַ
		 * �����û��Ǵ������Ǻ�ϸ�µ����⣬�����ڵݹ�ʵ�ֵ�ʱ����Щϸ�ڱ��봦��ã���Ȼ��������bug��
		 */
		sumList.remove(sumList.size()-1);
	}
} 

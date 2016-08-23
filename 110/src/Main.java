 
public class Main {

	public static void main(String[] args) {
        TreeNode r0 = new TreeNode(5);
		
		TreeNode r1 = new TreeNode(4);
		TreeNode r2 = new TreeNode(8);
		
		TreeNode r3 = new TreeNode(11);
		TreeNode r4 = new TreeNode(13);
		TreeNode r5 = new TreeNode(4);
		
		TreeNode r6 = new TreeNode(7);
		TreeNode r7 = new TreeNode(2);
		TreeNode r8 = new TreeNode(1);
		r0.left = r1;
		r0.right = r2;
		
		r1.left = r3;
		r2.left = r4;
		r2.right= r5;
		
		r3.left=r6;
		r3.right=r7;
		r5.right=r8;
		Solution sol = new Solution();
		System.out.println(sol.isBalanced(r0));
		
	
	}

}

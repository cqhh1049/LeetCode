 
public class Main {

	public static void main(String[] args) {
        TreeNode r0 = new TreeNode(1);
		
		TreeNode r1 = new TreeNode(2);
		TreeNode r2 = new TreeNode(3);
		
		TreeNode r3 = new TreeNode(5);
		
		r0.left = r1;
		r0.right = r2;
		
		r1.right = r3;
		
		Solution sol = new Solution();
		System.out.println(sol.binaryTreePath(r0));
		
	
	}

}

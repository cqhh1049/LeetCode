 
public class Main {

	public static void main(String[] args) {
        TreeNode r0 = new TreeNode(3);
		
		TreeNode r1 = new TreeNode(9);
		TreeNode r2 = new TreeNode(20);
		
		TreeNode r3 = new TreeNode(15);
		TreeNode r4 = new TreeNode(7);
		
		
		r0.left = r1;
		r0.right = r2;
		
		r2.left = r3;
		r2.right= r4;
		
	
		Solution sol = new Solution();
		System.out.println(sol.levelOrderBottom(r0));
		
	
	}

}

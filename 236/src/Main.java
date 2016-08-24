 
public class Main {

	public static void main(String[] args) {
        TreeNode r0 = new TreeNode(3);
		
		TreeNode r1 = new TreeNode(5);
		TreeNode r2 = new TreeNode(1);
		
		TreeNode r3 = new TreeNode(6);
		TreeNode r4 = new TreeNode(2);
		TreeNode r5 = new TreeNode(0);
		TreeNode r6 = new TreeNode(8);
		
		TreeNode r7 = new TreeNode(7);
		TreeNode r8 = new TreeNode(4);
		
		r0.left  = r1;
		r0.right = r2;
		
		r1.left  = r3;
		r1.right = r4;
        r2.left  = r5;
        r2.right = r6;
        
        r4.left  = r7;
        r4.right = r8;
        
		Solution sol = new Solution();
		System.out.println(sol.LCA(r0,r4,r8));
		
	
	}

}

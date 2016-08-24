 
public class Main {

	public static void main(String[] args) {
		TreeLinkedNode r0 = new TreeLinkedNode(1);
		
		TreeLinkedNode r1 = new TreeLinkedNode(2);
		TreeLinkedNode r2 = new TreeLinkedNode(3);
		
		TreeLinkedNode r3 = new TreeLinkedNode(4);
		TreeLinkedNode r4 = new TreeLinkedNode(5);
		TreeLinkedNode r5=  new TreeLinkedNode(6);
		TreeLinkedNode r6=  new TreeLinkedNode(7);
		
		
		r0.left = r1;
		r0.right = r2;
		
		r1.left = r3;
		r1.right = r4;
		r2.left = r5;
		
		r0.next=null;
		
		r1.next=r2;
		r2.next=null;
		
		r3.next=r4;
		r4.next=r5;
		r5.next=r6;
		r6.next=null;
		
		Solution sol = new Solution();
		System.out.println();
		
	
	}

}

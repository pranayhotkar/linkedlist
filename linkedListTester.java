public class linkedListTester{
	
		public static void main(String[] args) {
		linkedlist l1 = new linkedlist();

		l1.append(6);
		l1.push(5);
		l1.append(7);
		l1.insertAfter(l1.head.next,4); 

		System.out.println("Created linked list:");
		l1.printlist();
	}
}
public class linkedlist{

	class node {
		int data;
		node next;

		node(int data){
			this.data = data ;
			next = null;
		}
		
	}

	node head;

	public void push(int newData){
		//make a new node 
		node newNode = new node(newData);
		//newNode points to head
		newNode.next = head ;
		//head is made as newNode
		head = newNode;
	}

	public void append(int newData){
		//make a new node 
		node newNode = new node(newData);

		if(head == null){
			head = new node(newData);
			return;
		}

		newNode.next = null;
		node last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = newNode;
		return;
	}

	public void insertAfter(node previous,int newData){
		if(previous == null)
			return;

		node newNode = new node(newData);
		newNode.next = previous.next;
		previous.next = newNode;
	}

	public void printlist(){
		node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

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
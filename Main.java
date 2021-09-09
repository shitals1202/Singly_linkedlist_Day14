package Day14.SinglyLinkedList;

class Main{
	public static void main(String[] args){
	Linkedlist sList = new Linkedlist();

	sList.addNode(56);
	sList.addNode(30);
	sList.addNode(70);
	sList.addNode(75);
	sList.addNode(78);
	System.out.println("Original list:");
	sList.display();
	
		//sList.searchNode(70);
		//sList.deleteFromStart();
		//sList.deleteFromend();
		//System.out.println("Updated list: ");
		//sList.display();
		//sList.addInMid(65);
		System.out.println("Updated list");
		sList.display();
}
}
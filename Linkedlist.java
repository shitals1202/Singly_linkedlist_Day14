package Day14.SinglyLinkedList;

public class Linkedlist{
	public int size;
		public Node head = null;
		public Node tail =null;
	public void addNode(int data){
		Node newNode =new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void deleteFromStart(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			if(head != tail){
				head = head.next;
			}
			else{
				head = tail =null;
			}
		}
  		
	}
	public void deleteFromend(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			if(head != tail){
				Node current = head;
				while(current.next != tail){
					current = current.next;
				}
				tail = current;
				tail.next = null;
			}
			else{
				head = tail = null;
			}
		}
	}
	public void searchNode(int data){
		Node current = head;
		int i=1;
		boolean flag = false;
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			while(current != null){
				if(current.data == data){
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if(flag){
			System.out.println("Element is present in list at this position: "+i);
		}
		else{
			System.out.println("Element is not present");
		}
	}
 public void addInMid(int data){  
        
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            Node temp, current = null;    
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
            temp = head;  
            
            for(int i = 0; i < count; i++) {   
                current = temp;  
                temp = temp.next;  
            }
     		  current.next = newNode;   
            newNode.next = temp;  
        }  
        size++;  
    } 

	public void display(){
		Node current = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes os SinglyLinked List: ");
		while(current!=null){
			System.out.println(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	}

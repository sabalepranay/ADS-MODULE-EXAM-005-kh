class  ReverseLinkedList
 {
    static Node head;
	static  class Node
	 {
	    int data;
		Node next;
	 
   
   Node(int value)
    {
	  data=value;
	  next=null;
	}
   }
 
   void insert(int newdata)
    {
     Node newnode=new Node(newdata);
	 if( head==null)
	 {
	  head=newnode;
	  return;
	 }
	 newnode.next=null;
	 Node n=head;
	 while(n.next!=null)
	 {
	  n=n.next;
	 }
	 n.next=newnode;
	 return;
	}   
  
 static  Node Reversell(Node node)
  {
   Node prev=null;
   Node n=node;
   Node next=null;
   while(n!=null)
     {
	  next=n.next;
	  n.next=prev;
	  prev=n;
	  n=next;
	  }
	 node=prev;
	 return node;
    }
  
  static void print(Node head)
    {
	  Node n1=head;
	 while(n1!=null)
	  {
	  System.out.print(n1.data+" ");
	   n1=n1.next;
	  }
	System.out.println(" ");
	}
    
 public static void main(String[] args)
  {
    ReverseLinkedList rl=new ReverseLinkedList();
	
	rl.insert(1);
	rl.insert(5);
	rl.insert(1);
	rl.insert(2);
	rl.insert(3);
	rl.insert(4);
	rl.insert(5);
	
	rl.print(head);
	
	Node node=rl.Reversell(head);
    System.out.println("Reverse list is= ");
	rl. print(node);	
  
  ReverseLinkedList r2=new ReverseLinkedList();
     r2.insert(2);
	 r2.insert(4);
	 r2.insert(3);
	 r2.insert(4);
	 r2.insert(2);
	 r2.insert(5);
	
	r2.print(head);
	
	Node node1=r2.Reversell(head);
    System.out.println("Reverse list is= ");
	r2. print(node1);
  }
 }
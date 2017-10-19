package edu.dt;

class Node{
    Processor data;
    Node next;
    
    public Node(Processor data){
       this.data = data;
    }

    // CircularLinkedList
    public int size =0;
    public Node head=null;
    public Node tail=null;
    
    
    public static void main(String[] args) {
    	Node c = new Node();
    	        c.addNodeAtStart(3);
    	        c.addNodeAtStart(2);
    	        c.addNodeAtStart(1);
    	        c.print();
    	        c.deleteNodeFromStart();
    	        c.print();
    	        c.addNodeAtEnd(4);
    	        c.print();
    	System.out.println("Size of linked list: "+ c.getSize());
    	System.out.println("Element at 2nd position: "+ c.elementAt(2));
    	    }

  //add a new node at the start of the linked list
  public void addNodeAtStart(Processor data){
  System.out.println("Adding node " + data + " at start");
  Node n = new Node(data);
  if(size==0){
              head = n;
              tail = n;
              n.next = head;
          }else{
  Node temp = head;
              n.next = temp;
              head = n;
              tail.next = head;
          }
          size++;
      }
  


}

  



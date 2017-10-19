package edu.dt;

public class CircularLinkedList {
public int size =0;
public Processor head=null;
public Processor tail=null;
//add a new Processor at the start of the linked list
public void addProcessorAtStart(int data){
System.out.println("Adding Processor " + data + " at start");
Processor n = new Processor(data);
if(size==0){
            head = n;
            tail = n;
            n.next = head;
        }else{
Processor temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
public void addProcessorAtEnd(int data){
if(size==0){
            addProcessorAtStart(data);
        }else{
Processor n = new Processor(data);
            tail.next =n;
            tail=n;
            tail.next = head;
            size++;
        }
System.out.println("\nProcessor " + data + " is added at the end of the list");
    }
public void deleteProcessorFromStart(){
if(size==0){
System.out.println("\nList is Empty");
        }else{
System.out.println("\ndeleting Processor " + head.data + " from start");
            head = head.next;
            tail.next=head;
            size--;
        }
    }
public int elementAt(int index){
if(index>size){
return -1;
        }
Processor n = head;
while(index-1!=0){
            n=n.next;
            index--;
        }
return n.data;
    }
//print the linked list
public void print(){
System.out.print("Circular Linked List:");
Processor temp = head;
if(size<=0){
System.out.print("List is empty");
        }else{
do {
System.out.print(" " + temp.data);
                temp = temp.next;
            }
while(temp!=head);
        }
System.out.println();
    }
//get Size
public int getSize(){
return size;
    }
public static void main(String[] args) {
CircularLinkedList c = new CircularLinkedList();
        c.addProcessorAtStart(3);
        c.addProcessorAtStart(2);
        c.addProcessorAtStart(1);
        c.print();
       // System.out.println(c.head.next.next.next.data); 
        
        c.deleteProcessorFromStart();
        c.print();
        c.addProcessorAtEnd(4);
        c.print();
System.out.println("Size of linked list: "+ c.getSize());
System.out.println("Element at 2nd position: "+ c.elementAt(2));
    }
}



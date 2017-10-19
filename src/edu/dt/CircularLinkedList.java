package edu.dt;

public class CircularLinkedList {
public int size =0;
public Node1 head=null;
public Node1 tail=null;
//add a new Node1 at the start of the linked list
public void addNode1AtStart(int data){
System.out.println("Adding Node1 " + data + " at start");
Node1 n = new Node1(data);
if(size==0){
            head = n;
            tail = n;
            n.next = head;
        }else{
Node1 temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }
public void addNode1AtEnd(int data){
if(size==0){
            addNode1AtStart(data);
        }else{
Node1 n = new Node1(data);
            tail.next =n;
            tail=n;
            tail.next = head;
            size++;
        }
System.out.println("\nNode1 " + data + " is added at the end of the list");
    }
public void deleteNode1FromStart(){
if(size==0){
System.out.println("\nList is Empty");
        }else{
System.out.println("\ndeleting Node1 " + head.data + " from start");
            head = head.next;
            tail.next=head;
            size--;
        }
    }
public int elementAt(int index){
if(index>size){
return -1;
        }
Node1 n = head;
while(index-1!=0){
            n=n.next;
            index--;
        }
return n.data;
    }
//print the linked list
public void print(){
System.out.print("Circular Linked List:");
Node1 temp = head;
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
        c.addNode1AtStart(3);
        c.addNode1AtStart(2);
        c.addNode1AtStart(1);
        c.print();
        System.out.println(c.head.next.next.next.data); 
        
        c.deleteNode1FromStart();
        c.print();
        c.addNode1AtEnd(4);
        c.print();
System.out.println("Size of linked list: "+ c.getSize());
System.out.println("Element at 2nd position: "+ c.elementAt(2));
    }
}
class Node1{
int data;
Node1 next;
public Node1(int data){
this.data = data;
    }
}

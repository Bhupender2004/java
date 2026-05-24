// public class Linkedlist {
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next = newNode;
//     }
//     public void printList(){
//         if(head == null){
//             System.out.print("List is empty.");
//             return;
//         }
//         Node currNode = head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     public static void main(String [] args){
//         Linkedlist list = new Linkedlist();
//         list.addFirst("a");
//         list.addFirst("b");
//         list.addLast("c");
//         list.printList();
//     }
// }


// LinkedList using built in funciton.

// import java.util.*;
// class LL{
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList();
//         list.addFirst("B");
//         list.addFirst("A");
//         list.addLast("C");
//         for(int i=0; i<list.size(); i++){
//             System.out.print(list.get(i)+"->");
//         }
//         System.out.print("NULL");
//     }
// }


// class LinkedListBasics {

//     // Node class
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head;

//     // 1. Insert at Beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);

//         newNode.next = head;
//         head = newNode;
//     }

//     // 2. Insert at End
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;

//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//     // 3. Insert at Specific Position
//     public void insertAtPosition(int data, int pos) {

//         if (pos == 0) {
//             insertAtBeginning(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         Node temp = head;

//         for (int i = 0; i < pos - 1; i++) {
//             temp = temp.next;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // 4. Delete First Node
//     public void deleteFirst() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         head = head.next;
//     }

//     // 5. Delete Last Node
//     public void deleteLast() {

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         Node temp = head;

//         while (temp.next.next != null) {
//             temp = temp.next;
//         }

//         temp.next = null;
//     }

//     // 6. Delete Node at Position
//     public void deleteAtPosition(int pos) {

//         if (pos == 0) {
//             deleteFirst();
//             return;
//         }

//         Node temp = head;

//         for (int i = 0; i < pos - 1; i++) {
//             temp = temp.next;
//         }

//         temp.next = temp.next.next;
//     }

//     // 7. Search Element
//     public boolean search(int key) {

//         Node temp = head;

//         while (temp != null) {

//             if (temp.data == key) {
//                 return true;
//             }

//             temp = temp.next;
//         }

//         return false;
//     }

//     // 8. Count Nodes
//     public int countNodes() {

//         int count = 0;
//         Node temp = head;

//         while (temp != null) {
//             count++;
//             temp = temp.next;
//         }

//         return count;
//     }

//     // 9. Print Linked List
//     public void printList() {

//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }


//     // Main function
//     public static void main(String[] args) {

//         LinkedListBasics list = new LinkedListBasics();

//         list.insertAtBeginning(10);
//         list.insertAtBeginning(5);

//         list.insertAtEnd(20);
//         list.insertAtEnd(30);

//         list.insertAtPosition(15, 2);

//         list.printList();

//         System.out.println("Nodes count: " + list.countNodes());

//         System.out.println("Search 20: " + list.search(20));

//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

//         list.deleteAtPosition(1);
//         list.printList();
//     }
// }



// class LL{
//     Node head;
//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     public void deleteFirst(){
//         if(head == null){
//             System.out.print("The list is empty.");
//             return;
//         }
//         head = head.next;
//     }
//     public void deleteLast(){
//         if(head == null){
//             System.out.print("This list is empty.");
//             return;
//         }
//         if(head.next == null){
//             head = null;
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }
//         secondLast.next = null;
//     }


//     public void printList(){
//         if(head == null){
//             System.out.print("List is empty.");
//             return;
//         }
//         Node currNode = head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode = currNode.next;
//         }
//         System.out.print("NULL");
//     }
//     public static void main(String [] args){
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("b");
//         list.addLast("c");

//         list.deleteFirst();
//         list.deleteLast();

//         list.printList();
//     }
// }



//  Reverse Linked List...


// public class Linkedlist {
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     public void reverseList(){
//         if(head == null || head.next == null){
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;
//         while(currNode != null){
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }


//     public void printList(){
//         if(head == null){
//             System.out.print("List is empty.");
//             return;
//         }
//         Node currNode = head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     public static void main(String [] args){
//         Linkedlist list = new Linkedlist();
//         list.addFirst("a");
//         list.addFirst("b");
//         list.addLast("c");
//         list.reverseList();
//         list.printList();
//     }
// }



// Reverse Linked List using recursive method.

// public class Linkedlist {
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next = newNode;
//     }
//     public void printList(){
//         if(head == null){
//             System.out.print("List is empty.");
//             return;
//         }
//         Node currNode = head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }


//     public Linkedlist.Node reverseListRecursive(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newHead = reverseListRecursive(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }



//     public static void main(String [] args){
//         Linkedlist list = new Linkedlist();
//         list.addFirst("a");
//         list.addFirst("b");
//         list.addLast("c");

//         list.printList();

//         list.reverseListRecursive();
//         list.printList();
//     }
// }
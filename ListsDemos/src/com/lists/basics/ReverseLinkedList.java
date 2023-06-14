package com.lists.basics;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList4 list4 = new LinkedList4();
		list4.addNode(15);
		list4.addNode(25);
		list4.addNode(35);
		list4.addNode(45);
		list4.addNode(55);
		list4.addNode(65);
		list4.addNode(75);
		list4.addNode(85);
		list4.addNode(95);
		list4.addNode(105);
		list4.reverseList();
		list4.printMe();
	}

}
class LinkedList4{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
	Node tail =  null;
	public void addNode(int data) {
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
			tail = new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
		}
	}
	public void printMe() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public void reverseList() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		printMe();
	}
}
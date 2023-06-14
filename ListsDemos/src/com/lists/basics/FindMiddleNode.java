package com.lists.basics;

public class FindMiddleNode {

	public static void main(String[] args) {
		LinkedList2 list2 = new LinkedList2();
		list2.addNode(13);
		list2.addNode(23);
		list2.addNode(33);
		list2.addNode(43);
		list2.addNode(53);
		list2.addNode(63);
		list2.addNode(73);
		list2.addNode(83);
		list2.addNode(93);
		list2.addNode(103);
		list2.findMiddleNode();
		list2.printMe();
	}

}
class LinkedList2{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	Node head = null;
	Node tail = null;
	
	public void addNode(int data) {
		Node new_node = new Node(data);
		if(head == null) {
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
	public void findMiddleNode() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println(slowPointer.data);
	}
}
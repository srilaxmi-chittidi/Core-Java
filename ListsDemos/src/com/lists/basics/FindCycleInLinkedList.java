package com.lists.basics;

public class FindCycleInLinkedList {

	public static void main(String[] args) {
		LinkedList3 list3 = new LinkedList3();
		list3.addNode(14);
		list3.addNode(24);
		list3.addNode(34);
		list3.addNode(44);
		list3.addNode(54);
		list3.addNode(64);
		list3.addNode(74);
		list3.addNode(84);
		list3.addNode(94);
		list3.addNode(104);
		//list3.printMe();
		//list3.findCycle();
		list3.findMiddleEleInCycle();
	}

}
class LinkedList3{
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data =data;
		}
	}
	Node head = null;
	//Node tail = null;
	public void addNode(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head =  new_node;
			head.next = head;
		}else {
			Node current = head;
			while(current.next != head) {
				current = current.next;
			}
			current.next = new_node;
			new_node.next = head;
		}
	}
	public void findCycle() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(slowPointer != null &&
				fastPointer != null &&
					fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(slowPointer == fastPointer) {
				System.out.println(fastPointer.data);
				break;
			}
		}
	}
	public void findMiddleEleInCycle() {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(slowPointer != null &&
				fastPointer != null &&
				fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer.next == head || fastPointer.next.next == head) {
				System.out.println(slowPointer.data);
				break;
			}
		}
	}
	public void printMe() {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data+"|");
	}
}

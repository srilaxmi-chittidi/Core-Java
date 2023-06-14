package com.lists.basics;

public class DeleteNode {

	public static void main(String[] args) {
		LinkedList1 list1 = new LinkedList1();
		list1.addNodes(12);
		list1.addNodes(22);
		list1.addNodes(32);
		list1.addNodes(42);
		list1.addNodes(52);
		list1.deleteNode(12);
		list1.printMe();
	}

}
class LinkedList1{
	class Node{
		int data;
		Node next = null;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
	Node tail =  null;
	public void addNodes(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node;
			tail = new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
		}
	}
	public void deleteNode(int data) {
		Node temp = head;
		Node prevNode =null;
		while(temp.data != data) {
			prevNode = temp;
			temp= temp.next;
		}
		if(prevNode != null) {
			if(temp.next != null) {
				System.out.println(prevNode.data+" "+temp.data+" "+temp.next.data);
				prevNode.next = temp.next;
			}
		}else {
			temp.next.next = head;
			temp.next = null;
		}
	}
	public void printMe() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
}
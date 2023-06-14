package com.lists.basics;

public class CreateList {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.addNode(10);
		myList.addNode(20);
		myList.addNode(30);
		myList.addNode(40);
		myList.printMe();
	}

}
class LinkedList{
	class Node{
		int data;
		Node next = null;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void addNode(int data) {
		Node new_Node = new Node(data);
		if(head == null) {
			head = new_Node;
			tail = new_Node;
		}else {
			tail.next = new_Node;
			tail = tail.next;
		}
	}
	
	public void printMe(){
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}


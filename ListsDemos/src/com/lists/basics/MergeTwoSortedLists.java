package com.lists.basics;


public class MergeTwoSortedLists {

	public static void main(String[] args) {
		LinkedList5 list1 = new LinkedList5();
		list1.addNode(12);
		list1.addNode(22);
		list1.addNode(32);
		list1.addNode(42);
		list1.addNode(52);
		list1.printMe();
		LinkedList5 list2 = new LinkedList5();
		list2.addNode(13);
		list2.addNode(23);
		list2.addNode(33);
		list2.addNode(43);
		list2.addNode(53);
		list2.printMe();
		MergeTwoSortedLists ml = new MergeTwoSortedLists();
		Node l3 = ml.mergeLists(list1.head, list2.head);
		printFromNode(l3);
	}
	
	public static void printFromNode(Node start) {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
	public Node mergeLists(Node l1 , Node l2) {
		
		Node temp = new Node(0);
		Node current = temp;
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				current.next = l1;
				l1=l1.next;
			}else {
				current.next = l2;
				l2=l2.next;
			}
			current = current.next;
		}
		if(l1 != null) {
			current.next = l1;
		}
		if(l2 != null) {
			current.next = l2;
		}
		return temp.next;
			}
}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
class LinkedList5{
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
	public  void printMe() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("Null");
	}
}

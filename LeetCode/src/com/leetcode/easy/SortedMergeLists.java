package com.leetcode.easy;

public class SortedMergeLists {

	public static void main(String[] args) {
		LinkedList6 list1 =new LinkedList6();
		list1.addNode(12);
		list1.addNode(22);
		list1.addNode(32);
		list1.addNode(42);
		list1.addNode(52);
		list1.printMe();
		LinkedList6 list2 =new LinkedList6();
		list2.addNode(13);
		list2.addNode(23);
		list2.addNode(33);
		list2.addNode(43);
		list2.addNode(53);
		list2.printMe();
		Node start = mergeSortedLists(list1.head,list2.head);
		printFromHere(start);
	}
	public static Node mergeSortedLists(Node node1, Node node2) {
		Node temp = new Node(0);
		Node current = temp;
		while(node1 != null && node2 !=null) {
			if(node1.data<node2.data) {
				current.next = node1; node1 = node1.next;
			}else {
				current.next = node2; node2 = node2.next; 
			}
			current = current.next; 
		}
		if(node1 !=null) {
			current.next = node1;
		}
		if(node2 != null) {
			current.next = node2;
		}
		return temp.next;
	}
	public static void printFromHere(Node start) {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
}
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
	}
}
class LinkedList6{
	Node head = null;
	Node tail = null;
	public void addNode(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = tail.next;
		}
	}
	public void printMe() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
}
/**
 * Merge Two Sorted Lists Easy
You are given the heads of two sorted linked lists list1 and list2 .
Merge the two lists in a one sorted list. The list should be made by splicing
together the nodes of the first two lists.
Return the head of the merged linked list
*/

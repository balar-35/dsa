package day4;

import java.util.Scanner;

public class postassignment {
	
	class DNode {
	    int data;
	    DNode prev, next;

	    DNode(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}

	public class DoublyLinkedList {
	    DNode head = null;

	    public void insertAtBeginning(int data) {
	        DNode newNode = new DNode(data);
	        if (head != null) {
	            newNode.next = head;
	            head.prev = newNode;
	        }
	        head = newNode;
	    }

	    public void insertAtEnd(int data) {
	        DNode newNode = new DNode(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        DNode temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    public void deleteFromBeginning() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.next == null) {
	            head = null;
	        } else {
	            head = head.next;
	            head.prev = null;
	        }
	    }

	    public void deleteFromEnd() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.next == null) {
	            head = null;
	        } else {
	            DNode temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.prev.next = null;
	        }
	    }

	    public void displayForward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        DNode temp = head;
	        System.out.print("Forward: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("NULL");
	    }

	    public void displayReverse() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        DNode temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        System.out.print("Reverse: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("NULL");
	    }

	    public void search(int key) {
	        DNode temp = head;
	        int position = 1;
	        while (temp != null) {
	            if (temp.data == key) {
	                System.out.println("Element found at position: " + position);
	                return;
	            }
	            temp = temp.next;
	            position++;
	        }
	        System.out.println("Element not found.");
	    }

	    public static void main(String[] args) {
	    	postassignment dll = new postassignment();
	        Scanner sc = new Scanner(System.in);
	        int choice, data;

	        do {
	            System.out.println("\n--- Doubly Linked List Menu ---");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Delete from Beginning");
	            System.out.println("4. Delete from End");
	            System.out.println("5. Display Forward");
	            System.out.println("6. Display Reverse");
	            System.out.println("7. Search Element");
	            System.out.println("8. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert at beginning: ");
	                    data = sc.nextInt();
	                    dll.insertAtBeginning(data);
	                    break;
	                case 2:
	                    System.out.print("Enter data to insert at end: ");
	                    data = sc.nextInt();
	                    dll.insertAtEnd(data);
	                    break;
	                case 3:
	                    dll.deleteFromBeginning();
	                    break;
	                case 4:
	                    dll.deleteFromEnd();
	                    break;
	                case 5:
	                    dll.displayForward();
	                    break;
	                case 6:
	                    dll.displayReverse();
	                    break;
	                case 7:
	                    System.out.print("Enter element to search: ");
	                    data = sc.nextInt();
	                    dll.search(data);
	                    break;
	                case 8:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 8);

	        sc.close();
	    }
	}

	public void insertAtBeginning(int data) {
		
	}	

	public void search(int data) {
		
		
	}

	public void displayReverse() {
		
		
	}

	public void displayForward() {
	

	}

	public void deleteFromEnd() {
		
	}

	public void deleteFromBeginning() {
	
		
	}

	public void insertAtEnd(int data) {
		
		
	}


}

package day4;

public class task1 {

    public static class DoubleLinkedEx {
        Node head;
        Node tail;

        class Node {
            int data;
            Node next;
            Node prev;

            Node(int val) {
                data = val;
                next = null;
                prev = null;
            }
        }

        public DoubleLinkedEx() {  
            head = null;
            tail = null;
        }

        public void DoubleinsertBegin(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void DoubleinsertAtAnyPos(int pos, int val) {
            if (pos == 1) {
                DoubleinsertBegin(val);
                return;
            }

            Node newNode = new Node(val);
            Node temp = head;

            for (int i = 1; i < pos - 1; i++) {
                if (temp == null) {
                    System.out.println("Position out of bounds");
                    return;
                }
                temp = temp.next;
            }

            if (temp == tail) { 
                temp.next = newNode;
                newNode.prev = temp;
                tail = newNode;
            } else if (temp != null) { 
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            } else {
                System.out.println("Position out of bounds");
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void displayUsingPrev() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoubleLinkedEx list = new DoubleLinkedEx();

        list.DoubleinsertBegin(90);
        list.DoubleinsertBegin(777);
        list.DoubleinsertBegin(22);
        list.DoubleinsertBegin(900);
        list.DoubleinsertBegin(12);
        list.DoubleinsertBegin(55);

        System.out.print("Forward: ");
        list.display();

        System.out.print("Backward: ");
        list.displayUsingPrev();

        list.DoubleinsertAtAnyPos(4, 333);

        System.out.print("After insertion at position 4: ");
        list.display();
    }
}

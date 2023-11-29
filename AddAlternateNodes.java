import java.util.*;

class Node {
    int val;
    Node next;

    public Node(int value) {
        val = value;
        next = null;
    }
}

public class AddAlternateNodes {

    public static Node addAlternateNodes(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        int a = head.val;
        int b = head.next.val;

        Node temp = head.next.next;

        while (temp != null) {
            int c = temp.val;
            temp.val = temp.val + a;
            a = b;
            b = c;
            temp = temp.next;
        }

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        printList(head);

        addAlternateNodes(head);

        printList(head);
    }
}

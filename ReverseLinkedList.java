import java.util.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    static node head;
    static node tail;

    public static void insert(int n) {
        node temp = new node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static node reverse(int k, node head) {
        node curr = head;
        node prev = null;
        node after = null;
        int count = 0;
        node temp = head;
        int length = 0;
        while (temp != null) {
            length ++;
            temp = temp.next;
        }

        if (length < k)
            return head;
        while (curr != null && count < k) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
            count++;
        }
        if (after != null)
            head.next = reverse(k, after);
        return prev;
    }

    public static void printData() {
        if (head == null) {
            System.out.println("No elements");
        } else {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            insert(n);
        }
        int k = sc.nextInt();
        head = reverse(k, head);
        printData();
        sc.close();
    }
}

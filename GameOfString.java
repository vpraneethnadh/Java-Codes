import java.util.Scanner;

class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class GameOfString {
    static Node head;
    
    public static void insert(char ch) {
        Node temp = new Node(ch);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    
    public static void printData() {
        if (head == null) {
            System.out.println("No element");
        } else {
            Node tail = head;
            while (tail != null) {
                System.out.print(tail.data);
                tail = tail.next;
            }
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            insert(ch);
        }
        printData();
        sc.close();
    }
}

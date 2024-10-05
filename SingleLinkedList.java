class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    public int len;
    public node head;
    public node tail;

    public void insertatbeg(int n) {
        node temp = new node(n);
        if (head == null)
            head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    public void insertatend(int n) {
        node temp = new node(n);
        if (head == null)
            head = temp;
        else {
            tail = head;
            while (tail.next != null)
                tail = tail.next;
            tail.next = temp;
        }
        len++;
    }

    public void insertatpos(int n, int pos) {
        if (pos < 0 || pos > len)
            System.out.println("Invalid position");
        else {
            node temp = new node(n);
            if (head == null)
                head = temp;
            else if (pos == 1)
                insertatbeg(n);
            else {
                tail = head;
                while (pos - 1 > 2) {
                    tail = tail.next;
                    pos--;
                }
                temp.next = tail.next;
                tail.next = temp;
            }
        }
        len++;
    }

    public void deleteatbeg() {
        if (head == null)
            System.out.println("List is empty");
        else
            head = head.next;
        len--;
    }

    public void deleteatend() {
        if (head == null)
            System.out.println("List is empty");
        else {
            tail = head;
            while (tail.next.next != null)
                tail = tail.next;
            tail.next = null;
        }
        len--;
    }

    public void deleteatpos(int pos) {
        if (pos < 0 || pos > len)
            System.out.println("Invalid Position");
        else {
            if (pos == 1)
                deleteatbeg();
            else {
                tail = head;
                while (pos - 1 > 2) {
                    tail = tail.next;
                    pos--;
                }
                tail.next = tail.next.next;
            }
        }
        len--;
    }

    public void sort() {
        if (head == null)
            System.out.println("No links found");
        else {
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                node t1 = head;
                while (t1.next != null) {
                    if (t1.data > t1.next.data) {
                        int temp = t1.data;
                        t1.data = t1.next.data;
                        t1.next.data = temp;
                        swapped = true;
                    }
                    t1 = t1.next;
                }
            }
        }
    }

    public void printdata() {
        if (head == null)
            System.out.println("List is empty");
        else {
            node tail = head;
            while (tail != null) {
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("null");
        }
    }
}

public class SingleLinkedList {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertatbeg(10);
        ll.insertatbeg(20);
        ll.printdata();

        ll.insertatend(30);
        ll.insertatend(40);
        ll.printdata();

        ll.insertatpos(25, 2);
        ll.printdata();

        ll.deleteatbeg();
        ll.printdata();

        ll.deleteatend();
        ll.printdata();

        ll.deleteatpos(2);
        ll.printdata();

        ll.insertatend(10);
        ll.printdata();

        ll.sort();
        ll.printdata();
    }
}

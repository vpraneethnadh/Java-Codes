class dnode {
    int data;
    dnode next;
    dnode prev;

    dnode(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

class LinkedList2 {
    public dnode head;
    public dnode tail;
    public int len;

    public void insertatbeg(int n) {
        dnode temp = new dnode(n);
        if (head == null)
            head = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        len++;
    }

    public void insertatend(int n) {
        dnode temp = new dnode(n);
        if (head == null)
            head = temp;
        else {
            while (tail.next != null)
                tail = tail.next;
            tail.next = temp;
        }
        len++;
    }

    public void insertatpos(int n, int pos) {
        dnode temp = new dnode(n);
        if (pos < 0 || pos > len)
            System.out.println("Invlid position");
        else {
            tail = head;
            while (pos - 1 < 1) {
                tail = tail.next;
                pos--;
            }
            temp.next = tail.next;
            temp.prev = tail;
            tail.next.prev = temp;
            tail.next = temp;
        }
        len++;
    }

    public void deleteatbeg() {
        if (head == null)
            System.out.println("List is empty");
        else {
            head = head.next;
        }
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
        if (pos > len || pos < 0)
            System.out.println("Invalid Position");
        else {
            if (pos == 1)
                deleteatbeg();
            else {
                tail = head;
                while (pos - 1 > 1) {
                    tail = tail.next;
                    pos--;
                }
                tail.next = tail.next.next;
                tail.next.next.prev = tail.next;
            }
            len--;
        }
    }

    public void sort() {
        if (head == null)
            System.out.println("Linkedlist is empty");
        else {
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                dnode t1 = head;
                while (t1.next != null) {
                    int temp = t1.data;
                    t1.data = t1.next.data;
                    t1.next.data = temp;
                    swapped = true;
                }
                t1 = t1.next;
            }
        }
    }

    public void printdata() {
        if (head == null)
            System.out.println("List is Empty");
        else {
            while (tail != null) {
                System.out.print(tail.data + " ");
                tail = tail.next;
            }
            System.out.println("Null");
        }
    }
}

public class DoubleLinkedList {
    public static void main(String args[]) {
        LinkedList2 ll = new LinkedList2();
        ll.insertatbeg(10);
        ll.insertatbeg(20);
        ll.insertatbeg(30);
        ll.printdata();

        ll.insertatend(40);
        ll.insertatend(50);
        ll.insertatend(60);
        ll.printdata();

        ll.insertatpos(35, 4);
        ll.printdata();

        ll.deleteatbeg();
        ll.printdata();

        ll.deleteatend();
        ll.printdata();

        ll.deleteatpos(4);
        ll.printdata();

        ll.insertatend(10);

        ll.sort();
        ll.printdata();
    }
}